#! /usr/bin/perl
#ex4-8
for ($loop_ind =0, $double = 0.0, $text = "\n";
	$loop_ind <= 4;
	$loop_ind++, $double = 2.0 * $loop_ind) {
		print "Loop index " . $loop_ind . " doubled equals " . $double . $text;
}


