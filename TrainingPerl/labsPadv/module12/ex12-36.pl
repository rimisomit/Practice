#! /usr/bin/perl
#ex12-36
@array[0] = {favorite => "apples", 
		'second favorite' => "oranges"};
@array[1] = {favorite => "corn", 
		'second favorite' => "peas", 
		'least favorite' => "turnip"};
@array[2] = {favorite => "chicken", 
		'second favorite' => "beef"};

for $loopindex (0..$#array) {
	print "array[$loopindex]:\n\t{";
	for $key (keys %{$array[$loopindex]}) {
		print "$key => $array[$loopindex]{$key}, ";
	}
print "}\n";
}
