#! /usr/bin/perl
#ex8-22
@array = ("one", "two");
splice (@array, 2, 0, "three");
print join (", ", @array);

