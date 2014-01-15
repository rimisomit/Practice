#! /usr/bin/perl
#ex14-17
my $b='b';
my $a='$b';
$_='This is $a';
s/(\$\w+)/$1/eee;
print;
