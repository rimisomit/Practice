#! /usr/bin/perl
#ex10-1
open (FILEHANDLE, ">./hello1.txt") 
				or die ("Cannot open file hello.txt");
print FILEHANDLE "Hello1!";
close (FILEHANDLE);
