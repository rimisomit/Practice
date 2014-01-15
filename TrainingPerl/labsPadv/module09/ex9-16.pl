#! /usr/bin/perl -w
#ex9-16
if (open(CHILDHANDLE, "|-")) {
	print CHILDHANDLE "Here is the text.";
	close (CHILDHANDLE);
} else {
	$input = <>;
	print $input;
	exit;
}
