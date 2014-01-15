#! /usr/bin/perl -w
#ex14-106
$_='A';
print $& if /[\ua]/;

print "\n\n";

$_='AB]';
print $& if /[\Ua]b\E]/;
