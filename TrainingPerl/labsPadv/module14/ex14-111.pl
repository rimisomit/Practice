#! /usr/bin/perl -w
#ex14-111
my $a='1';
$b='2';
print "$&" if $a =~ /^1(?{$b='z'})$/;
