#! /usr/bin/perl -w
#ex12-31
@array = ( {favorite => "apples", 
	    'second favorite' => "oranges" },

	   {favorite => "corn", 
	    'second favorite' => "peas", 
	    'least favorite' => "turnip" },

	{favorite => "chicken", 
	 'second favorite' => "beef" }
);
print $array[0]{favorite};

