#! /usr/bin/perl
#ex2-30
%hash = ( fruit => apple,
	  sandwich => hamburger,
	  drink => bubby );
%hash = (%hash, dressing, 'blue cheese');
print $hash{dressing};

