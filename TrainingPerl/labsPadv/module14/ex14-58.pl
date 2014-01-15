#! /usr/bin/perl -w
##ex14-58
print "$`|$&|$'\n" if 'abc' =~ /(a?)*/;
print length $1;
