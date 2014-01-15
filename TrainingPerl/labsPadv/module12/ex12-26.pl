#! /usr/bin/perl -w
#ex12-26
%hash = (fruits => {favorite => "apples",
		'second favorite' => "oranges"},

	vegetables => {favorite => "corn",
		    'second favorite' => "peas",
		    'least favorite' => "turnip"},
	
	meat => {favorite => "chicken", 
		'second favorite' => "beef"}
	);
print $hash{fruits}{favorite};

