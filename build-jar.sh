#!/bin/sh

BUILD_DIR=build
CLASSES_DIR=$BUILD_DIR/classes
LIBS_DIR=$BUILD_DIR/libs
SOURCES_DIR=src
JAR_NAME=mochadoom.jar

# clean
echo "Clean build directory: $BUILD_DIR..."
rm -r $BUILD_DIR

# compile
echo "Compile files from: $SOURCES_DIR..."
mkdir -p $CLASSES_DIR
mkdir -p $LIBS_DIR
javac -d $CLASSES_DIR -cp $SOURCES_DIR $SOURCES_DIR/mochadoom/Engine.java

# jar
echo "Create jar file: $LIBS_DIR/$JAR_NAME..."
jar cmf $SOURCES_DIR/Manifest.txt $LIBS_DIR/$JAR_NAME -C $CLASSES_DIR .

