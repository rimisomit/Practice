#! /usr/bin/perl -w
#ex14-67
$_='abcd';
while (/(\w)/gc) { print "$1 " }
my @a=/\w/g;
print "\n". scalar @a;
