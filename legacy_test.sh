#!/usr/bin/env bash
set -euo pipefail

MAINCLASS=com.codemanship.refactoring.legacycode.ShippingApp

JAR=$(find target -name '*.jar' ! -name 'original-*' -print -quit 2>/dev/null)

if [ -z "$JAR" ]; then
    echo "No JAR found in target/. Run mvn package first."
    exit 1
fi

echo "Using JAR: $JAR"
echo

for ORDER in 1001 1002 1003; do
    echo "================================"
    echo "Running order $ORDER"
    echo "================================"
    java -cp "$JAR" "$MAINCLASS" "$ORDER"
    echo
done
