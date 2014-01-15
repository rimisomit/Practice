#! /usr/bin/perl -w
#ex14-72
$_='12991234';
my @a=/(?:\d{4})*?(99\d\d)/g;
print @a;
