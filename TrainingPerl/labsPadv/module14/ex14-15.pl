#! /usr/bin/perl
#ex14-15
my $a='a';
$_='This is $a';
s/(\$\w+)/$1/e;
print;
