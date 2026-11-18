const fs = require("fs");
const path = require("path");
const { buildFileTree } = require("./fileTree");

const workspaceRoot = path.resolve(__dirname, "..");
const javaRoot = path.join(workspaceRoot, "src", "main", "java");
const staticRoot = path.join(workspaceRoot, "src", "main", "resources", "static");
const siteRoot = path.join(workspaceRoot, "target", "github-pages");
const tree = buildFileTree(javaRoot, javaRoot);

fs.mkdirSync(siteRoot, { recursive: true });
fs.cpSync(staticRoot, siteRoot, { recursive: true });
fs.cpSync(javaRoot, path.join(siteRoot, "java"), { recursive: true });
fs.mkdirSync(path.join(siteRoot, "data"), { recursive: true });
fs.writeFileSync(path.join(siteRoot, "data", "tree.json"), JSON.stringify(tree));
fs.writeFileSync(path.join(siteRoot, ".nojekyll"), "");
