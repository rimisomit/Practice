#! /usr/bin/perl -w
#ex14-105
$_='abc';
my $a='ABC';
print $& if /^\L$a/;

# or
print "\n\n";

$_='abc';
print $& if /^\LABC/;
