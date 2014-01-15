#! /usr/bin/perl -w
#ex14-157
$_='ab';
&subr();
$_='cd';
&subr();

sub subr()
{ my $b=$_;
  my $re=qr/$b/;
  print "\$b=$b\n";
  if (/$re/)
   { print "Found $&\n" } else 
    { print "Not found\n" }
}



