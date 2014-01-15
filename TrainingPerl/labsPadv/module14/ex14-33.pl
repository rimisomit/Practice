#! /usr/bin/perl -w
#ex14-33
$_='1234567890';
/(\d)(\d)/g;

print "$1,$2\n";

my @a=/(\d)(\d)/g;
print join ',',@a;
