#! /usr/bin/perl -w
#ex14-152
my $a=$_='ab';
my $re=qr"ab"o;
for my $i (0..1)
{ print "$re\n";
   print "Found $&\n" if /$re/;
   $_=$a='cd';
   $re=qr"cd";
 }

