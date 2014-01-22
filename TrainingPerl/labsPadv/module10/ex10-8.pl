#! /usr/bin/perl
#ex10-8
open (FILEHANDLE, "<./file.txt") 
			or die ("Cannot open file file.txt");
while ($char = getc FILEHANDLE)
{ sleep 1; print $char; }


