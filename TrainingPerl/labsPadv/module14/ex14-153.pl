#! /usr/bin/perl -w
#ex14-153
$_='ab';
&subr();
$_='cd';
&subr();

sub subr()
{ my $b=$_;
  print "\$b=$b\n";
  if (/$b/)
   { print "Found $&\n" } else 
    { print "Not found\n" }
}


