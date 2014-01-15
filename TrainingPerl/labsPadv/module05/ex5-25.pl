#! /usr/bin/perl -w
#ex5-25
sub ctof	# centigrade to Fahrenheit
	{ $value = shift(@_);
	  return 9 * $value / 5 + 32; }

sub ftoc	# Fahrenheit to centigrade
	{ $value = shift(@_);
	  return 5 * ($value - 32) / 9; }

$tempconvert[0] = \&ftoc;
$tempconvert[1] = \&ctof;

print "Zero centigrade is " . &{$tempconvert[1]}(0) . " Fahrenheit.\n";
