#! /usr/bin/perl
#ex5-4
sub addem {
	$value1 = $_[0];
	$value2 = $_[1];
	print "$value1 + $value2 = " . ($value1+$value2);
};
addem(2,2);
