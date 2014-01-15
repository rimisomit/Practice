#! /usr/bin/perl -w
#ex14-134
my $a=$_='ab';
my $re=qr"$a";
print "Found $&\n" if /$re/;
$_=$a='cd';
$re=qr"$a";
print "Found $&\n" if /$re/;
