#! /usr/bin/perl -w
#ex14-87
my $a=3;
$_="abc${\($a == 3 ? '$a == 3' : '$a != 3')}def";
print $_;


