#! /usr/bin/perl
#ex2-38
$hash{fruit} = apple;
$hash{sandwich} = hamburger;
$hash{drink} = bubbly;
foreach $key (sort keys %hash) {
	print "$key => $hash{$key}\n";
}
