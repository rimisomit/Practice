#! /usr/bin/perl -w
#ex14-174
$_='abc';
my $a='(b)';
print "$1 $2" if /(a)(??{$a})(c)/;
