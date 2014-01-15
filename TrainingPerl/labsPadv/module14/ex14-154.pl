#! /usr/bin/perl -w
#ex14-154
$_='ab';
&subr();
$_='cd';
&subr();

sub subr()
{ my $b=$_;
  print "\$b=$b\n";
  if (/$b/o)
   { print "Found $&\n" } else 
    { print "Not found\n" }
}



