#! /usr/bin/perl -w
#ex2-16
@array = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
@array2 = @array[2..3];
print join(", ", @array2);
