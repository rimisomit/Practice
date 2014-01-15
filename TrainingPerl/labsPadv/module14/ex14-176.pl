#! /usr/bin/perl -w
#ex14-176
$_='abc';
my $a='(?:b)';
/(??{$a})/;


