#! /usr/bin/perl -w
#ex14-156
$_='ab';
for my $i (0..1)
 { my $b=$_;
   print "\$b=$b\n";
   if (/$b/o)
    { print "Found $&\n" } else 
     { print "Not found\n" }
   $_='cd';
 }


