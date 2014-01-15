#! /usr/bin/perl -w
#ex14-90

use strict;

my $a=2;
$_='21';
print $& if /^$a [1]$/x;
