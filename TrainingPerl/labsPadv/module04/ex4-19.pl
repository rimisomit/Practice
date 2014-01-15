#! /usr/bin/perl
#ex4-19
OUTER: for ($outer = 0; $outer < 10; $outer++) {
	$result = 0;
INNER: for ($inner = 0; $inner < 10; $inner++) {
	$result += $inner * $outer;
	next OUTER if $inner == $outer;
	print "$result\n";
	}
}


