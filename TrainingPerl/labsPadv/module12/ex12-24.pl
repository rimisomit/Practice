#! /usr/bin/perl -w
#ex12-24
@array = ( ["apples", "oranges"],
	   ["asparagus", "corn", "peas"],
	   ["ham", "chicken"] );
for $arrayref (@array)
{
	print join(", ", @{$arrayref}), "\n";
}
