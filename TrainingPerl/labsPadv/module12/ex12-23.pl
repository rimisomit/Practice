#! /usr/bin/perl -w
#ex12-23
for $outerloop (0..4) {
	for $innerloop (0..4) {
		$array[$outerloop][$innerloop] = 1;
	}
}
print $array[0][0];
