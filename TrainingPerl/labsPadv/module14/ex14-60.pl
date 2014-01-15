#! /usr/bin/perl -w
#ex14-60
$_='|ab|cd   |ef';
while (/\|(\w+)/g) { print "$1\n" }
