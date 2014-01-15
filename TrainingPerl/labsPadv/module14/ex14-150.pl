#! /usr/bin/perl -w
#ex14-150
my $a=$_='ab';
for my $i (0..1)
 { my $re=qr"$a"o;
   print "$re\n";
   print "Found $&\n" if /$re/;
   $_=$a='cd';
   $re=qr"$a";
 }
