#! /usr/bin/perl
#ex14-14
my $a='a';
$_='This is $a';
s/(\$\w+)/$1/;
print;
