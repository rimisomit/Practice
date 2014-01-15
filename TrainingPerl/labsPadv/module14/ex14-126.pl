#! /usr/bin/perl -w
#ex14-126
#!/usr/bin/perl -w
use strict;

$_='ab';
our $o=1;
my $m=1;
/  (?{ local $o })
   (?: a  (?{ $o++; $m++ })|
       ab (?{ print "\$o=$o, \$m=$m" })
   )
 $
/x;
