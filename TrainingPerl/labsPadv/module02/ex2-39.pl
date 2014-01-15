#! /usr/bin/perl
#ex2-39
$hash{fruit} = apple;
$hash{sandwich} = hamburger;
$hash{drink} = bubbly;
foreach $value (sort values %hash) {
	print "$value\n";
}

