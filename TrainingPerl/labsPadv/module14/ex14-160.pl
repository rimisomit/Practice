#! /usr/bin/perl -w
#ex14-160
my $a=1;
$_='ab';
/(a)/;
print "$1\n";
if ($a)
 { /(b)/;
   print "$1\n";
 }
print "$1\n";

