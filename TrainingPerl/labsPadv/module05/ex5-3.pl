#! /usr/bin/perl
#ex5-3
sub addem
{
	($value1, $value2) =@_;
	return $valuel + $value2;
}
print "2 + 2 = " . addem(2,2) . "\n";
