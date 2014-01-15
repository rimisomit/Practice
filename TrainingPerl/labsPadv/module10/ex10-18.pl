#! /usr/bin/perl
#ex10-18
opendir (DIRECTORY, ".")
		 or die "Cannot open current directory.";
print join("/", readdir(DIRECTORY));
closedir DIRECTORY;



