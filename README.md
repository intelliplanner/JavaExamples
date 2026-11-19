# Java Examples

This repository contains Java examples and a small web app for browsing and running them.

## Run locally

Requirements: Node.js and installed JDKs. The server's Java version entries in `node_runner/server.js` point to local JDK paths; update those paths to match your machine.

From the repository root:

```powershell
cd node_runner
npm install
npm start
```

Open [http://localhost:3000](http://localhost:3000). The local server lists Java files, displays their source, and can compile and run a selected file.

## Deploy the static browser to GitHub Pages

The workflow in `.github/workflows/build-nodejs.yml` runs on pushes to `main` and can also be started manually from the Actions tab. It runs `node node_runner/buildPages.js` to package the static page, Java file tree, and source files in `target/github-pages`, then deploys that directory to Pages.

For the first deployment, set **Settings → Pages → Build and deployment → Source** to **GitHub Actions**. The expected site URL is [https://intelliplanner.github.io/JavaExamples/](https://intelliplanner.github.io/JavaExamples/).

GitHub Pages is static hosting: browsing the Java file tree and source works, but compiling or running Java requires the local Node.js server. The Run control is disabled on the Pages site.
