#! /usr/bin/perl
#ex12-33
push @array, {favorite => "apples", 
		'second favorite' => "oranges"};
push @array, {favorite => "corn", 
		'second favorite' => "peas", 
		'least favorite' => "turnip"};
push @array, {favorite => "chicken", 
		'second favorite' => "beef"};

print $array[0]{favorite};
