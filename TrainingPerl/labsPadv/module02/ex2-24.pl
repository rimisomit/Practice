#! /usr/bin/perl -w
#ex2-24
@array1 = ("one", "two");
@array2 = ("three", "four");
splice (@array1, 2, 0, @array2);
print join(", ", @array1);


