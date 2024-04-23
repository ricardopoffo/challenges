#!/usr/bin/env bash
echo "# challenges" >> README.md
touch .gitignore
git init
git add --all
git commit -m "first commit"
git branch -M main
git remote add origin $1
git push -u origin main
git branch dev
git push origin --all
git push origin --tags
echo "Done."    