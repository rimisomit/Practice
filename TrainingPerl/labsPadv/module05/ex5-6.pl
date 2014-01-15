#! /usr/bin/perl
#ex5-6
sub addem
{
	$sum = 0;
	foreach $element (@_)
		{ $sum += $element; }
	print join(" + ", @_) . " = " . $sum . "\n";
};

addem(2, 2, 2);

