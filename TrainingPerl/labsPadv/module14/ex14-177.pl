#! /usr/bin/perl -w
#ex14-177
my $a='abc';
my $b='cde';
my $re='(\w)';
$a =~ /$re/;
print "$1\n";
$b =~ //;
print $1;


