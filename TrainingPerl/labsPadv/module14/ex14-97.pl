#! /usr/bin/perl -w
#ex14-97
$_='123abc';
my $a='^\d';
print $& if /[$a]+/;
