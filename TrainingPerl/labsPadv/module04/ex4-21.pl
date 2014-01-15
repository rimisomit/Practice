#! /usr/bin/perl
#ex4-21
$index = 1;
START: {
	if ($index > 5) {last START};
	print "Hello";
	if ($index == 5) {next START};
	print "... ";
} continue {
	$index++;
	redo START;
}
print "!\n";



