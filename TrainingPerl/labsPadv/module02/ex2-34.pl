#! /usr/bin/perl
#ex2-34
$hash{fruit} = apple;
$hash{sandwich} = hamburger;
$hash{drink} = bubbly;
foreach $key (keys %hash){
	print $hash{$key} . "\n";
}
