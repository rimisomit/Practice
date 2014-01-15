#! /usr/bin/perl -w
#ex14-133
my $a=$_='ab';
my $re=qr"$a";
print "Found $&\n" if /$re/;
$_=$a='cd';
print "Found $&\n" if /$re/;
