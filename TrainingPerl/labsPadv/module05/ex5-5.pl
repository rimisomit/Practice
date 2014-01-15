#! /usr/bin/perl
#ex5-5
sub addem {
	$value1 = shift @_;
	$value2 = shift @_;
print "$value1 + $value2 = " . ($value1+$value2);
};
addem(2,2);
