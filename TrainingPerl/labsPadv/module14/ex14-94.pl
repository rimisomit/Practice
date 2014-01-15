#! /usr/bin/perl -w
#ex14-94
my @a=([1,2],[3,4]);
$_='2';
print $& if /^$a[0][1]$/;
