#! /usr/bin/perl
#ex12-32
@array[0] = {favorite => "apples", 
	     'second favorite' => "oranges"};
@array[1] = {favorite => "corn", 
	     'second favorite' => "peas", 
	     'least favorite' => "turnip"};
@array[2] = {favorite => "chicken", 
	     'second favorite' => "beef"};

print $array[0]{favorite};
