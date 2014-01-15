#! /usr/bin/perl -w
#ex14-173
$_='abc';
print "$1 $2" if /(a)(??{"(b)"})(c)/;
