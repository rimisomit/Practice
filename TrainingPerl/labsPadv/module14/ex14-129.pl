#! /usr/bin/perl -w
#ex14-129
$_='123abcd';
my $re=qr/((\d+)\w+)/;
/$re/;
print "$1 $2";

