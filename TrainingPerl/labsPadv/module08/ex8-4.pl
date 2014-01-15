#! /usr/bin/perl
#ex8-4
$hash{sandwich} = grilled;
$hash{drink} = 'rot beer';
while (($key, $value) = each(%hash))
{
	print "$key => $value\n";
}

