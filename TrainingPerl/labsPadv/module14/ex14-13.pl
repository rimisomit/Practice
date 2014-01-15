#! /usr/bin/perl
#ex14-13
$_='aa bb aa';
s/(\w+)\s+\w+/$1 $1/;
print;
