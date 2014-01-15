#! /usr/bin/perl -w
#ex14-92
my $a=2;
$_='21';
print $& if /^$a(?=)[1]$/;
