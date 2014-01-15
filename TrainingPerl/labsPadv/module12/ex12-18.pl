#! /usr/bin/perl -w
#ex12-18
@array = ( ["apples", "oranges"],
	   ["asparagus", "corn", "peas"],
	   ["ham", "chicken"] );
	push @{$array[0]}, "banana";
print $array[0][2];
