#! /usr/bin/perl -w
#ex12-22
# удалить среднюю строку:
@array = ( ["apples", "oranges"],
	   ["asparagus", "corn", "peas"],
	   ["ham", "chicken"] );
splice @array, 1 ,0; 
print $array[0][0], ", ", $array[1][0];
