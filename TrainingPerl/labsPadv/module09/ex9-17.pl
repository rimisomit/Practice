#! /usr/bin/perl -w
#ex9-17
if (open(CHILDHANDLE, "-|")) {
	$input = <CHILDHANDLE>;
	print $input;
	close (CHILDHANDLE);
} else {
	print "Here is the text.";
	exit;
}
