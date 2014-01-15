#! /usr/bin/perl -w
#ex12-28
%hash = (
	fruits => {favorite => "apples", 
		   'second favorite' => "oranges"},
	vegetables => {favorite => "corn", 
		       'second favorite' => "peas", 
		       'least favorite' => "turnip"}
);

print $hash{fruits}{'second favorite'};
