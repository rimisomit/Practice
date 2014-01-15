#! /usr/bin/perl -w
#ex14-155
$_='ab';
for my $i (0..1)
 { my $b=$_;
   print "\$b=$b\n";
   if (/$b/)
    { print "Found $&\n" } else 
     { print "Not found\n" }
   $_='cd';
 }


