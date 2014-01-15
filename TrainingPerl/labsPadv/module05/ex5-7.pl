#! /usr/bin/perl -w
#ex5-7
sub addem {
	($value1, $value2) = @_;
	 $value2 ||= 1;
print "$value1 + $value2 = " . ($value1+$value2);
};

addem(2);
