#! /usr/bin/perl -w
#ex14-23
my $a='(';
'abc' =~ /$a\w)*/;
print $1;
