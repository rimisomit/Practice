#! /usr/bin/perl
#ex3-11
print "Please type the letter y\n";
while (<>) {
chop;
	if ($_ ne 'y') {
		print "Please type the letter y\n";
	} else {
		print "Do you always do what you're told?\n";
		exit;
	}
}
