#! /usr/bin/perl -w
#ex14-91
my $a=2;
$_='21';
print $& if /^$a(?#)[1]$/;
