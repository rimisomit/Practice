#! /usr/bin/perl -w
#ex14-127
$_='ab';
our $o=1;
/  (?{ my $m=10; local $o })
   (?: a  (?{ $o++; $m++ })|
       ab (?{ print "\$o=$o, \$m=$m" })
   )
 $
/x;
