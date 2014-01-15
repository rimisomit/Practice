#! /usr/bin/perl
#ex10-3
open (FILEHANDLE, "<array.dat") 
			or die ("Cannot open file array.dat");
chomp(@array = <FILEHANDLE>) ;
close FILEHANDLE;
print join (', ', @array);
