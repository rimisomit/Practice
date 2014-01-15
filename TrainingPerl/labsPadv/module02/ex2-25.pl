#! /usr/bin/perl -w
#ex2-25
@array = ("one", "zero");
@array2 = ("two", "three", "four");
splice (@array, 1,1, @array2);
print join(", ", @array);


