#! /usr/bin/perl -w
#ex2-17
@array = ("one", "two", "three");
for ($loop_ind=0; $loop_ind<=$#array; $loop_ind++) {
	print $array[$loop_ind];
}
