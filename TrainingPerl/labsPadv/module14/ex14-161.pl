#! /usr/bin/perl -w
#ex14-161
$_='ab';
/(a)/;
print "$1\n";
&subr();
print "$1\n";

sub subr()
{ /(b)/;
  print "$1\n";
}
