#! /usr/bin/perl
#ex10-10
open (FILEHANDLE, "<file.txt") 
			or die ("Cannot open file file.txt");
seek FILEHANDLE, 12, 0;
print tell FILEHANDLE;
close (FILEHANDLE);



