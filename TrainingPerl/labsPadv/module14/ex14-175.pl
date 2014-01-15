#! /usr/bin/perl -w
#ex14-175
$_='abc';
my $a=qr'(b)';
print "$1 $2" if /(a)(??{$a})(c)/;

