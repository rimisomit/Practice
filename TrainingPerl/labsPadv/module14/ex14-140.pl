#! /usr/bin/perl -w
#ex14-140
$_='aB';
my $re=qr/[a-z]+/;
print $& if /$re/;

