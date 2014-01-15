#! /usr/bin/perl
#ex2-32
$hash{fruit} = apple;
$hash{sandwich} = hamburger;
$hash{drink} = bubbly;

delete ($hash{"fruit"});

if (exists($hash{"fruit"})) {
	print "Element exists.";
} else {
	print "Element does not exist.";
}


