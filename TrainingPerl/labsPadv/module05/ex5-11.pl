#! /usr/bin/perl -w
#ex5-11
sub printem {
	$inner = shift @_;
	print $inner;
}

printem "Hello!\n";
print "/" . $inner;
