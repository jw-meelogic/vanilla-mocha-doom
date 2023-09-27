# Mocha Doom

![Top Language](https://img.shields.io/github/languages/top/gaborbata/mochadoom.svg?style=flat)
![Code Size](https://img.shields.io/github/languages/code-size/gaborbata/mochadoom.svg?style=flat)
![License](https://img.shields.io/github/license/gaborbata/mochadoom.svg?style=flat&logo=gnu)
[![Java CI with Gradle](https://github.com/gaborbata/mochadoom/workflows/Java%20CI%20with%20Gradle/badge.svg)](https://github.com/gaborbata/mochadoom/actions/workflows/gradle.yml)

Mocha Doom is a pure Java Doom source port. Most of the hard work of porting Doom to Java has already been done, thanks to Velktron (Maes), but he has stopped working on it in 2013. Although the port is almost complete, some work remains to do, most importantly the network code for the multiplayer is missing.

Mocha Doom can play original variants of Doom. If you don't own any, you may download the [Shareware](http://cdn.debian.net/debian/pool/non-free/d/doom-wad-shareware/doom-wad-shareware_1.9.fixed.orig.tar.gz) version of Doom, extract it and copy the `DOOM1.WAD` file into your Mocha Doom directory.

# How to run

## IDE

1. Open the project with IntelliJ IDEA, Eclipse or NetBeans
2. Build and run the project

## Linux shell scripts

On Linux, two different scripts can be used.

1. `build-and-run.sh` which will build Mocha Doom and run it. You can use it as such: `./build-and-run.sh -iwad ~/DOOM1.WAD`. This is the preferred way to quickly test changes for developers.
2. `build-jar.sh` which will build a JAR file. You can then run the JAR file as such: `java -jar mochadoom.jar -iwad ~/DOOM1.WAD`. This is the preferred way for distributing a Mocha Doom executable.

## Gradle

[Gradle](https://gradle.org/) is a cross-platform build tool, which can be also used to run and build Mocha Doom.
First of all, you have to install Gradle following its [installation notes](https://gradle.org/install/). After that you can use one of the following commands:

* Run Mocha Doom: `gradle clean run`
* Build a JAR file: `gradle clean build`

  This creates a JAR file in the `build/libs/` folder.
  You can then run the JAR file as such: `java -jar build/libs/mochadoom.jar -iwad ~/DOOM1.WAD`.

## Launch Doom with classic controls

You can use `classic.cfg` configuration in order to have the old-school classic key controls, e.g.

`java -jar mochadoom.jar -config classic.cfg -iwad ~/DOOM1.WAD`

or

`gradle run --args="-config classic.cfg -iwad ~/DOOM1.WAD"`

The configuration has the following differences:

| Configuration   | Default          | Classic                        |
| --------------- | ---------------- | ------------------------------ |
| key_right       | 77 (right arrow) | 77 (right arrow)               |
| key_left        | 75 (left arrow)  | 75 (left arrow)                |
| key_up          | 17 (W)           | 72 (up arrow)                  |
| key_down        | 31 (S)           | 80 (down arrow)                |
| key_strafeleft  | 30 (A)           | 51 (Alt+left arrow) or comma   |
| key_straferight | 32 (D)           | 52 (Alt+right arrow) or period |
| key_fire        | 29 (Control)     | 29 (Control)                   |
| key_use         | 57 (Space)       | 57 (Space)                     |
| key_strafe      | 56 (Alt)         | 56 (Alt)                       |
| key_speed       | 54 (Shift)       | 54 (Shift)                     |
| use_mouse       | 1 (enabled)      | 0 (disabled)                   |

Check [CONFIG.md](CONFIG.md) for more options.

# License

Mocha Doom contains work from many contributors. Here are the main contributors, but it's no limited to this list. Others are listed in the copyright headers of the files where they own copyright.

- Copyright (C) 1993-1996  [id Software, Inc.](http://www.idsoftware.com/)
- Copyright (C) 2010-2013  [Victor Epitropou](https://sourceforge.net/projects/mochadoom/)
- Copyright (C) 2016-2017  [Alexandre-Xavier Labonté-Lamoureux](https://github.com/AXDOOMER/)
- Copyright (C) 2017  [Good Sign](https://github.com/GoodSign2017)

Mocha Doom is distributed under the [GNU GPLv3](https://www.gnu.org/licenses/gpl-3.0.en.html).

# Rip and Tear!

Mocha Doom in action:
![so_much_blood](https://cloud.githubusercontent.com/assets/6194072/18658610/94a326c2-7ed2-11e6-98af-4ed4c8b28510.png)
