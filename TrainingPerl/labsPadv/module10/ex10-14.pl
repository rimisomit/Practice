#! /usr/bin/perl
#ex10-14
open (FILEHANDLE, "<./file.txt") 
			or die ("Cannot open file file.txt");
$text ="";
until (eof(FILEHANDLE)) {
	read (FILEHANDLE, $newtext, 1);
	$text .= $newtext;
}
print $text;



