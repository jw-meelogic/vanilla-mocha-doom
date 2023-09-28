#!/bin/sh

# check if java executable exists
if [ -d "$JAVA_HOME" -a -x "$JAVA_HOME/bin/java" ]; then
    JAVACMD="$JAVA_HOME/bin/java"
else
    JAVACMD=java
fi

$JAVACMD -version >/dev/null 2>&1
if [ "$?" != "0" ]; then
  echo "Install Java (JDK or JRE) if you do not already have. Mocha Doom will not work without it."
  echo "Please make sure PATH, or JAVA_HOME environment variables point to a valid Java installation."
  echo "Could not execute Mocha Doom (exit: $?)"
  exit
fi

# detect the absolute path of Mocha Doom
MOCHA_DOOM_HOME=`dirname "$0"`

# detect cygwin
cygwin=false;
case "`uname -s`" in
    CYGWIN*)
        cygwin=true
        ;;
esac

if $cygwin ; then
    MOCHA_DOOM_PATH=`cygpath "$MOCHA_DOOM_HOME"`
else
    MOCHA_DOOM_PATH="$MOCHA_DOOM_HOME"
fi

# execute Mocha Doom
exec "$JAVACMD" -jar "$MOCHA_DOOM_PATH/mochadoom.jar" "$@"
