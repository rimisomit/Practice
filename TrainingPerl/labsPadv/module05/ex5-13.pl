#! /usr/bin/perl
#ex5-13
$testvalue = 10;
if ((my $variable1 = 10) > $testvalue) {
	print "Value, ", $variable1, ", is qreater than the test value.\n";
} elsif ($variable1< $testvalue) {
	print "Value, ", $variable1, ", is less than the test value.\n";
} else {
	print "Value, ". $variable1, ", is equal to the test value.\n";
}
