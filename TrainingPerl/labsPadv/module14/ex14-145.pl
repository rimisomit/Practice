#! /usr/bin/perl -w
#ex14-145
my $a='ab';
$_='$a';
my $re=qr'^$a$';
print "\$re=$re\n";
print $& if /$re/;
