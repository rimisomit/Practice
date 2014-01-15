#! /usr/bin/perl
#ex10-2
open (FILEHANDLE, ">array.dat") 
			or die ("Cannot open file array.dat");
$, = "\n";
@array = (1, 2, 3);
print FILEHANDLE @array;
close (FILEHANDLE);
