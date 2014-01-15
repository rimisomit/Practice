#! /usr/bin/perl
#ex2-31
$hash{fruit} = apple;
$hash{sandwich} = hamburger;
$hash{drink} = bubbly;
if (exists($hash{"vegetable"})) {
	print "Element exists.";
} else {
	print "Element does not exist.";
}


