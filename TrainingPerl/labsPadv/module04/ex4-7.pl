#! /usr/bin/perl
#ex4-7
while (<>) {
	chomp;
	unless (/^q/i) {
		print;
	} else {
		exit;
	}
}


