#! /usr/bin/perl -w
#ex12-19
# добавить строку перед строкой с индексом 1:
@array = ( ["apples", "oranges"],
	   ["asparagus", "corn", "peas"],
	   ["ham", "chicken"] );
splice @array, 1 ,0 , ["chess", "checkers", "go"];
print $array[0][0], ", ", $array[1][0], ", ", $array[2][0];

