#! /usr/bin/perl -w
#ex12-16
sub zerolist { return (0, 0, 0, 0, 0); };
#print zerolist;
for $loopindex (0..4) {
	$array[$loopindex] = [zerolist];
}


print $array[0][0];
