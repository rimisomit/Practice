#! /usr/bin/perl
#ex4-4
@array = ("one", "two", "three");
$loop_ind = 0;
while ($loop_ind <= $#array) {
	print $array[$loop_ind] . " ";
}
continue {
	$loop_ind++;
}
