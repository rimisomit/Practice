#! /usr/bin/perl -w
#ex14-118
my $n;
$_='20 0 36 35';
while (/(\d+)(?{$n=$+ if !defined $n || $n < $+})/g) {}
print "The largest number is $n" if defined $n;
