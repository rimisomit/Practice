#! /usr/bin/perl
#ex10-5
open (FILEHANDLE, "<file.txt") 
			or die ("Cannot open file file.txt");
while (<FILEHANDLE>) {
print;
}


