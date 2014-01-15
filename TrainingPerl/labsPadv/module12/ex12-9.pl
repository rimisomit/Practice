#! /usr/bin/perl
#ex12-9
@array = ( ["apples", "oranges"],
	   ["asparaqus", "corn", "peas"],
	   ["ham", "chicken"] );
for $loopindex (0.. $#array) {
		print join(", ", @{$array[$loopindex]}), "\n";
}
