#! /usr/bin/perl
#ex12-1
for $outerloop (0..4) {
	for $innerioop (0..4) {
		$array["$outerloop, $innerloop"] = 1;
	} 
}
print $array['0,0'];
