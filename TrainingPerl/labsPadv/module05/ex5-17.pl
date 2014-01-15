#! /usr/bin/perl -w
#ex5-17
sub factorial {
	my $value = shift @_;
if ($value == 1) {
	return $value;
} else {
	return $value * factorial($value-1);
}
}

$result = factorial(6);
print $result;
