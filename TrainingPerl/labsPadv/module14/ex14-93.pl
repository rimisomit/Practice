#! /usr/bin/perl -w
#ex14-93
my $a=2;
$_='21';
print $& if /^${a}a{0}[1]$/;
