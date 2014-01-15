#! /usr/bin/perl -w
#ex14-141
$_='aB';
my $re=qr/[a-z]+/i;
print $& if /$re/;

