#! /usr/bin/perl
#ex1-3
$variable1 = 5;
undef $variable1;
if (defined $variable1) {
	print "\$variable1 is defined. \n";
} else {
	print "\$variable1 is not defined. \n";
}
