#! /usr/bin/perl
#ex4-2
$factorial = 1;
for ($loop_ind = 1; $loop_ind <= 6; $loop_ind++) {
	$factorial *= $loop_ind;
}
print "6! = $factorial\n";
