#! /usr/bin/perl -w
#ex12-30
%hash = (
	fruits => {favorite => "apples", 
		   second => "oranqes"},
	vegetables => {favorite => "corn", 
			second => "peas"}
);

for $food (sort keys %hash) {
	print "$food:\n\t {";
	for $key (sort keys %{$hash {$food}}) {
		print "'$key' => \"$hash{$food}{$key}\",";
	}
print "}\n";
}
