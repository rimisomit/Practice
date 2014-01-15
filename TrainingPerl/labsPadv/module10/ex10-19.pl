#! /usr/bin/perl
#ex10-19
mkdir "tmp", 0744;
chdir "tmp";
open (FILEHANDLE, ">hello.txt") 
			or die "Cannot open file hello.txt.";
print FILEHANDLE "Hello!";
close (FILEHANDLE);


