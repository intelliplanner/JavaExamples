// generateClassList.js
const fs = require("fs");
const path = require("path");
const { buildFileTree } = require("./fileTree");

const workspaceRoot = path.resolve(__dirname, "..");
const srcRoot = path.join(workspaceRoot, "src", "main", "java");
const outputFile = path.join(workspaceRoot, "src", "main", "resources", "static", "index.html");

function renderTree(tree) {
  return tree.map((node) => {
    if (node.type === "directory") {
      return `<li><details open><summary>${node.name}</summary><ul>${renderTree(node.children)}</ul></details></li>`;
    }
    return `<li>${node.name}</li>`;
  }).join("");
}

const tree = buildFileTree(srcRoot, srcRoot);
const html = `<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <title>Java Project Runner</title>
  <style>
    body { font-family: Arial, sans-serif; margin: 20px; }
    ul { padding-left: 20px; }
    li { margin: 4px 0; }
  </style>
</head>
<body>
  <h2>Java Files in src/main/java</h2>
  <ul>${renderTree(tree)}</ul>
</body>
</html>`;

fs.writeFileSync(outputFile, html);
console.log(`Generated ${path.relative(workspaceRoot, outputFile)}`);
