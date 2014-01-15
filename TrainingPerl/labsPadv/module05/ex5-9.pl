#! /usr/bin/perl -w
##ex5-9
sub addem
{
	($value1, $value2) = @_;
	return $value1+$value2;
};

print "2 + 2 = " . addem(2, 2) . "\n";

