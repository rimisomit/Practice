#! /usr/bin/perl -w
#ex14-64
$_='abcd';
/\w/g;
my @a=/\w/g;
print @a;
