#! /usr/bin/perl -w
#ex12-25
%hash = (
	fruits => {
		favorite => "apples",
		'second favorite' => "oranqes"
	},
	
	vegetables => {
		favorite => "corn",
		'second favorite' => "peas",
		'least favorite' => "turnip"
	},

	meat => {
		favorite => "chicken",
		'second favorite' => "beef"
	}
);
print $hash{fruits}{favorite};
