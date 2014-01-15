#! /usr/bin/perl
#ex10-13
open(FILEHANDLE, ">hello.txt") 
			or die ("Cannot open file hello.txt");
select FILEHANDLE;
print "Hello!";
close(FILEHANDLE);




