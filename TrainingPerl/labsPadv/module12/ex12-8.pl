#! /usr/bin/perl
#ex12-8
@array = ( ["apples", "oranges"],
	   ["asparagus", "corn", "peas"],
	   ["ham", "chicken"] );
for $outerloop (0..$#array) {
	for $innerloop (0..3) {
		print $array [$outerloop][$innerloop],
	}
print "\n";
}
