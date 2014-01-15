#! /usr/bin/perl
#ex3-8
print '-'x30 . "\n";

@ones = (1)x80; 
foreach $el (@ones)
	{print "$el";}
print "\n";

@ones = (5)x@ones;	# reoalce oll 1's to 5's
foreach $el (@ones)
	{print "$el";}
print "\n";
