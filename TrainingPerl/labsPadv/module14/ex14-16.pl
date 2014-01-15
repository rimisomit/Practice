#! /usr/bin/perl
#ex14-16
my $a='a';
$_='This is $a';
s/(\$\w+)/$1/ee;
print;
