#! /usr/bin/perl -w
#ex2-15
@array = (1, 2, 3);
$#array = 10;
$array[5] = " Were is a new element!";
print $array[5];
