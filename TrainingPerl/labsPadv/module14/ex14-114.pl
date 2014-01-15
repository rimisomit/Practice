#! /usr/bin/perl -w
#ex14-114
use re 'eval';

$_='aaa';
my $a='(?{print "OK "})';
print "$&" if /^aaa$a$/;
