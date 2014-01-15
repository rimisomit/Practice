#! /usr/bin/perl
#ex2-37
$hash{fruit} = apple;
$hash{sandwich} = hamburger;
$hash{drink} = bubbly;
while (($key, $value) = each(%hash))
	{ print "$key: $value\n"; };

