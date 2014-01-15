#! /usr/bin/perl
#ex5-2
sub printifOK {
	my $internalvalue = shift(@_);

if ($internalvalue > 10) {
	print "Value is $internalvalue.\n";
} else {
	print "Value is too small.\n";}
};


$value = 10;
printifOK ($value);
$value = 12;
printifOK ($value);
