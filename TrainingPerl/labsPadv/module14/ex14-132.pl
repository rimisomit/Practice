#! /usr/bin/perl -w
#ex14-132
$_='Ab';
$re=qr/[a-z]+/;
print $& if $_ =~ $re;

# compare code
print "\n\n";

$_='Ab';
$re=qr/[a-z]+/i;
print $& if $_ =~ $re;
