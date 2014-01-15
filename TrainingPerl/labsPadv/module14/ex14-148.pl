#! /usr/bin/perl -w
#ex14-148
my $a='ab';
$_='|';
my $re=qr'^\|$';
print "\$re=$re\n";
print "Found $&" if /$re/;
