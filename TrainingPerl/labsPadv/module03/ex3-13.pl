#! /usr/bin/perl
#ex3-13
print "Please enter numbers from 5 to 10\n";
while (<>) {
chop;
	if ($_ < 5 || $_ > 10) {
		print "Please enter numbers from 5 to 10\n";
	} else {
		print "Thank you - let's have another!\n"; }
}
