#! /usr/bin/perl -w
#ex14-128
$_='ab';
our $o=1;
my $m=10;
/  (?{ my $m=5; local $o })
   (?: a  (?{ $o++; $m++ })|
       ab (?{ print "\$o=$o, \$m=$m" })
   )
 $
/x;
