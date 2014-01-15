#! /usr/bin/perl -w
#ex14-120
my $n;
$_='20 0 36 35';
/(?<!\d)(\d+)(?{$n=$+ if !defined($n) || $n < $+})(?!)/;
print "The largest number is $n" if defined $n;
