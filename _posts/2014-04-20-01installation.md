---
title: The LA-PDFText Command Line Application
description:  Instructions for installing the LA-PDFText system.
layout: defaultTOC
prevPage: 01installation.html
nextPage: 02runningCommands.html
---

1. Installation Manual
===

*Note that this system is provided with no warranty or guarantee* 

LA-PDFText is abased on *command-line tools to run text extraction commands from PDF files*.

Installation
------------

### Installing and running the command line tools from prebuilt binaries.

This system is provided as a `\*.tar.gz` archive for Unix and Linux systems, 
a `\*.dmg` instalallable for Macs and an `\*.exe` installable for PCs.

* Mac: [lapdftext\_macos\_1\_7\_4\-SNAPSHOT.dmg](http://bmkeg2.s3-website-us-west-2.amazonaws.com/000_lapdftext/lapdftext_macos_1_7_4-SNAPSHOT.dmg)
* Unix: [lapdftext\_unix\_1\_7\_4\-SNAPSHOT.tar.gz](http://bmkeg2.s3-website-us-west-2.amazonaws.com/000_lapdftext/lapdftext_unix_1_7_4-SNAPSHOT.tar.gz)
* Windows: [lapdftext\_windows\-x64\_1\_7\_4-SNAPSHOT.exe](http://bmkeg2.s3-website-us-west-2.amazonaws.com/000_lapdftext/lapdftext_windows-x64_1_7_4-SNAPSHOT.exe)

### Installing and running the command line tools from source

The command line tools are implemented within the `https://github.com/BMKEG/lapdftext` 
library. 

```
1. git clone https://github.com/BMKEG/lapdftextProject
2. mvn -DskipTests clean package
3. cd lapdftext
3. mvn -DskipTests assembly:assembly 
	# This builds the assembled library from all dependencies,
	# but skips unit tests within the code that could take a lot of time to run 
4. Running commands using the jar file follows exactly the same logic as for prebuilt 
   installed tools but requires each command to be issued using java directly based on: 
   $ java -classpath target/lapdftext-1.7.4-SNAPSHOT-jar-with-dependencies.jar
     [path.to.executable] [command.options]   
```

