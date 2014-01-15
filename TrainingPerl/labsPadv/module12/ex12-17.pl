#! /usr/bin/perl -w
#ex12-17
@array = ( ["apples", "oranges"],
	   ["asparagus", "corn", "peas"],
	   ["ham", "chicken"] );
$array[3] = ["chicken noodle", "chili"];
print $array[3][0];
