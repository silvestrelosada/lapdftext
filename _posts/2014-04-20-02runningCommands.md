---
title: The LA-PDFText Command Line Application
description:  Instructions for installing the LA-PDFText system.
layout: defaultTOC
prevPage: 01installation.html
nextPage: 03recommendedUse.html
---

2. Running the Commands 
---

Usage of the tool as a software application is currently based on a set of command-line functions. 

**$ blockStatistics** ```input-dir-or-file``` [```output-dir```]

* ```input-dir-or-file``` - the full path to the PDF file or directory to be extracted 
* ```output-dir``` (optional or '-') - the full path to the output directory 

Running this command on a PDF file or directory will generate 
statistics about each chunk in each pdf document .

**$ blockify** ```input-dir-or-file``` [```output-dir```]

* ```input-dir-or-file``` - the full path to the PDF file or directory to be extracted 
* ```output-dir``` (optional or '-') - the full path to the output directory 

Running this command on a PDF file or directory will attempt to generate 
one XML document per file with unnannotated text chunks .

**$ blockifyClassify** ```input-dir-or-file``` [```output-dir```] [```rule-file```]

* ```input-dir-or-file``` - the full path to the PDF file or directory to be extracted 
* ```output-dir``` (optional or '-') - the full path to the output directory 
* ```rule-file``` (optional or '-') - the full path to the rule file 

Running this command on a PDF file or directory will attempt to generate 
one XML document per file with text chunks annotated with section.

**$ debugChunkFeatures** ```input-dir-or-file``` [```output-dir```] [```rule-file```]

* ```input-dir-or-file``` - the full path to the PDF file or directory to be extracted 
* ```output-dir``` (optional or '-') - the full path to the output directory 
* ```rule-file``` (optional or '-') - the full path to the rule file 

Running this command on a PDF file or directory will generate a CSV file for the PDF that can act as a template for rule files. All available features are listed .

**$ extractFullText** ```input-dir-or-file``` [```output-dir```] [```rule-file```] [```sec1``` ... ```secN```]

* ```input-dir-or-file``` - the full path to the PDF file or directory to be extracted 
* ```output-dir``` (optional or '-') - the full path to the output directory 
* ```rule-file``` (optional or '-') - the full path to the rule file 
* ```sec1``` ... ```secN``` (optional) - a list of section names to be included in the dump 

Running this command on a PDF file or directory will attempt to extract uninterrupted
two-column- formatted text of the main narrative section of the paper with one 
font change (i.e. for papers that use a smaller font for methods sections).
Figure legends are moved to the end of the paper (but included), and 
tables are dropped.

**$ imagifyBlocks** ```input-dir-or-file``` [```output-dir```] 

* ```input-dir-or-file``` - the full path to the PDF file or directory to be extracted 
* ```output-dir``` (optional or '-') - the full path to the output directory 

Running this command on a PDF file or directory will attempt to generate 
one image per page with text chunks drawn out with labels describing 
the predominant Font + Style of each block. This is helpful in developing
rule files.

**$ imagifySections** ```input-dir-or-file``` [```output-dir```] [```rule-file```]

* ```input-dir-or-file``` - the full path to the PDF file or directory to be extracted 
* ```output-dir``` (optional or '-') - the full path to the output directory 
* ```rule-file``` (optional or '-') - the full path to the rule file 

Running this command on a PDF file or directory will attempt to generate 
one image per page with text chunks drawn out with section labels.
This is intended to provide a debugging tool.

**$ watchPdfFolder** ```COMMAND``` ```dir-to-be-watched``` ```output-dir``` [```rule-file```]

* ```COMMAND``` - the command to be executed: 
 - ImagifyBlock
 - ImagifySection
 - Blockify
 - BlockifyClassify
 - ReadText
* ```dir-to-be-watched``` - the full path to the directory to be watched 
* ```output-dir``` (optional or '-') - the full path to the output directory 
* ```rule-file``` (optional or '-') - the full path to the rule file 

This program maintains a watcher on this directory to execute the 
denoted command on any PDF files added to the directory. 
The system will then delete the appropriate files and folders
when the originating PDF file is removed.

Note that this function has not been fully tested and may fail. 