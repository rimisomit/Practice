#! /usr/bin/perl
#ex10-9
open (FILEHANDLE, "<file.txt") 
		or die ("Cannot open file file.txt");
seek FILEHANDLE, 10, 0;
while (<FILEHANDLE>) {
print;
}
close (FILEHANDLE);



