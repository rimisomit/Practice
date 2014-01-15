#! /usr/bin/perl -w
#ex14-84
my @a=([1,2],[3,4]);
$_="abc${\(join ',',(@{$a[0]},@{$a[1]}))}def";
print $_;


