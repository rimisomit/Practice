#! /usr/bin/perl -w
#ex5-21
sub printhello {
	my $handle = shift;
	print $handle "Hello!\n";
}
printhello (\*STDOUT);

