#!/bin/sh

BUILD_DIR=build
CLASSES_DIR=$BUILD_DIR/classes
SOURCES_DIR=src

# clean
echo "Clean build directory: $BUILD_DIR..."
rm -r $BUILD_DIR

# compile
echo "Compile files from: $SOURCES_DIR..."
mkdir -p $CLASSES_DIR
javac -d $CLASSES_DIR -cp $SOURCES_DIR $SOURCES_DIR/mochadoom/Engine.java

# run
echo "Run..."
java -cp $CLASSES_DIR mochadoom.Engine "$@"

