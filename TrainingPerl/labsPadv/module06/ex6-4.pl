#! /usr/bin/perl 
#ex6-4
@array = (1, 2, 3);
$arrayreference = \@array;
print $arrayreference->[0];
