#! /usr/bin/perl
#ex4-13
$hash{fruit} = orange;
$hash{sandwich} = clubburger;
$hash{drink} = lemonade;
while (($key, $value) = each(%hash))
	{ print "$key => $value\n"; }



