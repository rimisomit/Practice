#! /usr/bin/perl -w
#ex14-65
$_='abcd';
my @a=/\w/g;
print "@a\n";
if (/(\w)/g) { print "Found $1" }
