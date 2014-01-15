#! /usr/bin/perl
#ex3-12
print "Please enter numbers from 5 to 10\n";
while (<>) {
chop;
	if ($_ >= 5 && $_ <= 10) {
		print "Thank you - let's have another!\n";
	} else {
		print "Please enter numbers from 5 to 10\n"; }
}

