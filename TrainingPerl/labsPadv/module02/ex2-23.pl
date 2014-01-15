#! /usr/bin/perl -w
#ex2-23
@array = ("one", "two");
splice (@array, 2, 0, "three");
print join(", ", @array);


