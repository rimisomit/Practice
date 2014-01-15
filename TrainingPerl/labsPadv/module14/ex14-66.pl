#! /usr/bin/perl -w
#ex14-66
$_='abcd';
while (/(\w)/g) { print "$1 " }
my @a=/\w/g;
print "\n@a";
