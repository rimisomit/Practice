#! /usr/bin/perl -w
#ex14-95
$"=',';
my @a=(1,2,3);
$_='1,2,3';
print $& if /^@a$/;
