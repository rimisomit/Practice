#! /usr/bin/perl
#ex12-2
for $outerloop (0..4) {
	for $innerloop (0..4) {
		$array[$outerloop][$innerloop] = 1;
	} 
}
print $array[0][0];
