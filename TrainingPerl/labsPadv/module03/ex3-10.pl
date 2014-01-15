#! /usr/bin/perl
#ex3-10
print "Please enter letters from k to m\n";
while (<>) {
chop;
	if ($_ lt 'k' or $_ gt 'm') {
		print "Please enter letters from k to m\n";
	} else {
		print "Thank you - let's have another!\n";
	}
}
