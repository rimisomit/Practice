#! /usr/bin/perl -w
#ex14-61
$_='|ab|cd   |ef';
while (/\G\|(\w+)/g) { print "$1\n" }
