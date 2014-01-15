#! /usr/bin/perl -w
#ex14-73
$_='12991234';
my @a=/(?:(?!99)\d{4})*(99\d\d)/g;
print @a;

