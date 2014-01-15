#! /usr/bin/perl
#ex14-12
$_='aa bb aa';
s/(\w+)(?:\s+\w+){2}/$1 $1/;
print;
