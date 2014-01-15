#! /usr/bin/perl
#ex10-6
open (FILEHANDLE, "<file.txt") 
			or die ("Cannot open file file.txt");
$text ="";
while (read (FILEHANDLE, $newtext, 1)) {
	$text .= $newtext;
}
print $text;

