#! /usr/bin/perl -w
#ex14-139
$_='abc111abc';
my $re1=qr/([a-z]+)/;
my $re2=qr/(\d+)(??{$^N})/;
print "$&\n$1" if /$re1$re2/;
