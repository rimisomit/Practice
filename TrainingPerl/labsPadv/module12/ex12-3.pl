#! /usr/bin/perl
#ex12-3
for $outerloop (0..4) {
	for $innerloop (0..4) {
		$array[$outerloop][$innerloop] = 1;
	} 
}
print $array[0][0];
print "\n";
print @array;

