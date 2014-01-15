#! /usr/bin/perl -w
#ex14-68
$_='abcd';
my @a=/\w/gc;
print "@a\n";
if (/\w/g) { print "Found $1" } else { print 'Not found' }

