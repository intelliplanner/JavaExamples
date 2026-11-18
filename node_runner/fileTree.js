const fs = require("fs");
const path = require("path");

function buildFileTree(dir, rootDir = dir) {
  const entries = fs
    .readdirSync(dir, { withFileTypes: true })
    .filter((entry) => entry.isDirectory() || (entry.isFile() && entry.name.endsWith(".java")))
    .sort((a, b) => a.name.localeCompare(b.name));

  return entries.map((entry) => {
    const fullPath = path.join(dir, entry.name);
    if (entry.isDirectory()) {
      return {
        name: entry.name,
        type: "directory",
        children: buildFileTree(fullPath, rootDir),
      };
    }

    return {
      name: entry.name,
      type: "file",
      path: path.relative(rootDir, fullPath).replace(/\\/g, "/"),
    };
  });
}

function flattenFiles(tree, files = []) {
  for (const node of tree) {
    if (node.type === "directory") {
      flattenFiles(node.children, files);
    } else {
      files.push(node.path);
    }
  }
  return files;
}

module.exports = {
  buildFileTree,
  flattenFiles,
};
