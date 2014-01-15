#! /usr/bin/perl
#ex10-1
open (FILEHANDLE, ">hello.txt") 
				or die ("Cannot open file hello.txt");
print FILEHANDLE "Hello!";
close (FILEHANDLE);
