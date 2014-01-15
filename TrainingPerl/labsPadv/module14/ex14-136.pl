#! /usr/bin/perl -w
#ex14-136
$_='ABCabc123';
my $re1=qr/[A-Z]+/;
my $re2=qr/(\d+)/;
print "$&\n$1\n$2" if /$re1([a-z]+)$re2/;
