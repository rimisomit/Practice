#! /usr/bin/perl -w
#ex14-130

use strict;

$_='123abcd';
my $re=qr/((\d+)\w+)/;
$re;
print "$1 $2";
