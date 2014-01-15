#! /usr/bin/perl
#ex2-3
$data = "Here's the data";
@data = (1, 2, 3);
*alsodata = *data;
print "$alsodata as a scalar\n";
print "@alsodata as an array\n";
