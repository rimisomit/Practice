#! /usr/bin/perl
#ex2-35
$hash{fruit} = apple;
$hash{sandwich} = hamburger;
$hash{drink} = bubbly;
foreach $value (values %hash){
	print "$value\n";
}

