const express = require("express");
const { execFile } = require("child_process");
const fs = require("fs");
const path = require("path");
const { buildFileTree, flattenFiles } = require("./fileTree");

const app = express();
const workspaceRoot = path.resolve(__dirname, "..");
const srcRoot = path.join(workspaceRoot, "src", "main", "java");
const staticDir = path.join(workspaceRoot, "src", "main", "resources", "static");
const javaVersions = [
  { label: "Java 8 (jdk1.8.0_192)", value: "jdk1.8.0_192", path: "D:\\Software_Installed_Dir\\java\\jdk1.8.0_192" },
  { label: "Java 21 (jdk-21.0.3)", value: "jdk-21.0.3", path: "D:\\Software_Installed_Dir\\java\\jdk-21.0.3" },
];

app.use(express.static(staticDir));
app.use(express.json());

function getJavaFileTree() {
  return buildFileTree(srcRoot, srcRoot);
}

function getJavaFiles() {
  return flattenFiles(getJavaFileTree()).sort();
}

function isSafePath(candidatePath) {
  const resolved = path.resolve(candidatePath);
  return resolved === srcRoot || resolved.startsWith(srcRoot + path.sep);
}

function getJavaExecutablePath(javaHome, executableName) {
  const suffix = process.platform === "win32" ? ".exe" : "";
  return path.join(javaHome, "bin", `${executableName}${suffix}`);
}

function getClassName(sourceText, filePath) {
  const packageMatch = sourceText.match(/^\s*package\s+([a-zA-Z0-9_.]+)\s*;/m);
  const packageName = packageMatch ? packageMatch[1] : "";
  const typeMatch = sourceText.match(/\b(?:class|interface|enum)\s+([A-Za-z_$][\w$]*)\s+/);
  const simpleName = typeMatch ? typeMatch[1] : path.basename(filePath, ".java");
  return packageName ? `${packageName}.${simpleName}` : simpleName;
}

app.get("/api/files", (_req, res) => {
  const files = getJavaFiles();
  res.json(files);
});

app.get("/api/tree", (_req, res) => {
  res.json(getJavaFileTree());
});

app.get("/api/java-versions", (_req, res) => {
  res.json(javaVersions);
});

app.get("/api/file", (req, res) => {
  const relativePath = req.query.path;
  if (!relativePath) {
    return res.status(400).send("Missing path");
  }

  const fullPath = path.join(srcRoot, relativePath);
  if (!isSafePath(fullPath)) {
    return res.status(400).send("Invalid path");
  }

  fs.readFile(fullPath, "utf8", (err, content) => {
    if (err) {
      return res.status(404).send("File not found");
    }
    res.type("text/plain").send(content);
  });
});

app.get("/run", (req, res) => {
  const classPath = req.query.class;
  const versionValue = req.query.javaVersion || "jdk-21.0.3";
  const fullPath = path.join(srcRoot, classPath);

  if (!classPath || !isSafePath(fullPath)) {
    return res.status(400).send("Invalid class path");
  }

  const selectedVersion = javaVersions.find((item) => item.value === versionValue) || javaVersions[1];
  const javaHome = selectedVersion?.path;
  const javacPath = getJavaExecutablePath(javaHome, "javac");
  const javaPath = getJavaExecutablePath(javaHome, "java");
  const outputDir = path.join(workspaceRoot, "target", "java-runner");

  fs.mkdirSync(outputDir, { recursive: true });

  fs.readFile(fullPath, "utf8", (readErr, sourceText) => {
    if (readErr) {
      return res.status(404).send("File not found");
    }

    const className = getClassName(sourceText, fullPath);

    execFile(javacPath, ["-d", outputDir, fullPath], { env: { ...process.env, JAVA_HOME: javaHome } }, (compileErr) => {
      if (compileErr) {
        return res.send("Compilation error: " + compileErr.message);
      }

      execFile(javaPath, ["-cp", outputDir, className], { cwd: outputDir, env: { ...process.env, JAVA_HOME: javaHome } }, (runErr, stdout, stderr) => {
        if (runErr) {
          return res.send("Runtime error: " + runErr.message);
        }
        res.send(stdout || stderr || "Program completed without output.");
      });
    });
  });
});

app.listen(3000, () => console.log("Server running at http://localhost:3000"));
