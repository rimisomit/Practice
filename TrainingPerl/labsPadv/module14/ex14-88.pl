#! /usr/bin/perl -w
#ex14-88
my @a=('abc','def');
$_='def';
print $& if /^$a[1]$/;

