#! /usr/bin/perl
#ex2-41
$hash1{fruit} = apple;
$hash1{sandwich} = hamburger;
$hash1{drink} = bubbly;
$hash2{cake} = chocolate;
$hash2{pie} = blueberry;
$hash2{'ice cream'} = pecan;

%bighash = (%hash1, %hash2);
	print $bighash{'ice cream'};


