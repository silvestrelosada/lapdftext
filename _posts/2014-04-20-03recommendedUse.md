---
title: The LA-PDFText Command Line Application
description:  Instructions for installing the LA-PDFText system.
layout: defaultTOC
prevPage: 02runningCommands.html
nextPage: 03recommendedUse.html
---

3. Recommended Use of the System 
---
### Step 1 - Organize your PDFs into subdirectories based on formatting

LAPDF-Text operates recursively over subdirectories to find all PDF files and extract text from them accordingly based on the formatting layout of documents. You should therefore organize your PDFS ahead of time based on whether papers are all two-column formats, or are from the same journal and so have similar layouts across many papers. This way, you can develop your own rule files to help extract text accurately.

### Step 2 - Run ```imagify``` functions to check that the system can read the PDFs correctly and eyeball the outputs. 

As an example, download this paper: [Makki et al. 2010, PLoS Biology 8:e1000441](http://www.plosbiology.org/article/fetchObject.action?uri=info%3Adoi%2F10.1371%2Fjournal.pbio.1000441&representation=PDF)

And then run ```imagifySections``` on it (i.e., using the PDF file as the only parameter). This should generate 12 image files that show each page with each block drawn out as a rectangle with a baseline classification added to the file. Running ```imagifySections``` is always a great sanity check to make sure that the system is working. 

### Step 3 - Run ```blockify``` or ```blockifyClassify``` to get XML

If you're happy with the results provided from the imagify runs, as shown above, you should then try the two blockify commands. These generate XML output that can be parsed and read as necessary. 

### Step 4 - Run ```extractFullText``` to get plain text
 
Note that this command will attempt to order the blocks to place text that does not form part of the main narrative at the end of the file. Making sure that the block classification is accurate is essential to make sure that the text is correctly ordered.

### Step 5 - Develop your own rule files with ```debugChunkFeatures```

If you run the ```debugChunkFeatures``` command on the PDF file, the system will generate a CSV file that you can use as a template for developing rules. If you open the CSV file in Excel, each row is a separate block and each column are the various features used to enact classification rules on each block. It is possible to code each rule column to improve the quality of the rules being used to classify each block. We will describe this process in more detail in another Wiki page on this site presently, but the file generated should provide a working model from which you can try to build your own rule files.  

Having started to develop your own rule files, iterate through steps 1-4 to try to improve performance for each set of documents with different formatting. This should allow you to extract text from PDF files accurately with a little time investment into developing your own rule files for your own documents. 

### RECOMMENDATION - Use the SciKnowMine system to run LA-PDFText for scientific papers.

The SciKnowMine interface provides additional functionality for using LA-PDFText, including a web interface for hacking rule files. Check it out here: [sciKnowMine](http://bmkeg.github.io/sciKnowMine/) 