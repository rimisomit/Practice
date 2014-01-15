#! /usr/bin/perl
#ex10-4
open (FILEHANDLE, ">format.txt") 
		or die ("Cannot open file format.txt");
format FILEHANDLE =
@<<<<<<<<<<@>>>>>>>>>>>>
$text1, $text2
.
$text1 = "Hello";
$text2 = "there";
write FILEHANDLE;
close (FILEHANDLE);

