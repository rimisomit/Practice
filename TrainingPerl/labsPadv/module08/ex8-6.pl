#! /usr/bin/perl
#ex8-6
$hash{fruit} = apple;
$hash{sandwich} = hamburger;
$hash{drink} = bubbly;
if (exists($hash{"vegetable"}))
	{ print "Element exists."; }
else
	{ print "Element does not exists."; }
