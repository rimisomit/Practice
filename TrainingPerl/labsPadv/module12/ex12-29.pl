#! /usr/bin/perl -w
#ex12-29
%hash = (
	fruits => {favorite => "apples", 
		   second => "oranqes"},
	veqetables => {favorite => "corn", 
		       second => "peas"}
);

for $food (keys %hash) {
	print "$food:\n\t {";
	for $key (keys %{$hash{$food}}) {
		print '"key' => \"$hash{$food}{$key}\",";
	}
print "}\n";
}
