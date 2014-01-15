#! /usr/bin/perl -w
#ex14-86
$_="abc${\(&subr('Bill'))}def";
print $_;

sub subr($) { return "Hello $_[0]!" }


