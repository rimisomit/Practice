#! /usr/bin/perl -w
#ex14-131
$_='123abcd';
my $re=qr/((\d+)\w+)/;
$_ =~ $re;
print "$1 $2";
