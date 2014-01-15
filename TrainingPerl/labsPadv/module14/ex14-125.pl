#! /usr/bin/perl -w
#ex14-125

use strict;

$_='ab';
our $o=1;
my $m=1;
/
(?: a  (?{ $o++; $m++ })  |
     ab (?{ print "\$o=$o, \$m=$m" })
)
           $
/x;
