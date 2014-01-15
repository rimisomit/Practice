#! /usr/bin/perl
#ex7-7
undef $/;
open HANDLE, "file.txt";
$text = <HANDLE>;
print $text;
