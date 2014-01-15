#! /usr/bin/perl -w
##ex14-144
my $a='ab';
$_='ab';
my $re=qr"^$a$";
print "\$re=$re\n";
print $& if /$re/;
