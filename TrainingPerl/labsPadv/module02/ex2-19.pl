#! /usr/bin/perl -w
#ex2-19
@array1 = (1, 2, 3);
@array2 = (4, 5, 6);
foreach $element (@array1, @array2) {
	print "$element\n";
}
