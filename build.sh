#!/bin/bash

# Make build directory
if [[ ! -d build ]]; then
	mkdir build
fi

# Build dependencies
cd ../gambezi_java
./build.sh
cd ../gambezi_dashboard_java

# Get dependencies
cp ../gambezi_java/build/gambezi.jar build/
cp ../gambezi_java/build/java_websocket.jar build/

# Compiling files
javac -cp build/java_websocket.jar:build/gambezi.jar -Xlint:unchecked -d build/ $(find . -name "*.java" -type f)

# Package into jar
cd build/
jar cvf gambezi_dashboard.jar com/*
