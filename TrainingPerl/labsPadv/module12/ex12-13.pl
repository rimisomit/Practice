#! /usr/bin/perl
#ex12-13
@{$array[0]} = ("apples", "oranges");
@{$array[1]} = ("asparagus", "corn", "peas");
@{$array[2]} = ("ham", "chicken");
print $array[1][1];

