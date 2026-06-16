#!/usr/bin/env bash
set -uo pipefail

git add .

if mvn test; then
  git commit -m "It works!"
else
  git reset --hard
fi