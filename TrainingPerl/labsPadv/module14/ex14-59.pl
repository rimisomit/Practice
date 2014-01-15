#! /usr/bin/perl -w
#ex14-59
print "$`|$&|$'\n" if 'abc' =~ /(?:(a?)(?{print 'pos='.pos($_).", text='$1'\n"}))*/;
print length $1;
