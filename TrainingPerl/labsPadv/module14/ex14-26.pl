#! /usr/bin/perl -w
#ex14-26
$_='number 1: 12345678 number 2: 98765432154321';
s/(?<=\d)(?=(?:\d{3})+(?!\d))/,/g;
print $_;


