#! /usr/bin/perl -w
#ex12-21
# заменить одну строку на две:
@array = ( ["apples", "oranges"],
	   ["asparagus", "corn", "peas"],
	   ["ham", "chicken"] );
splice @array, 0 ,1 , ["chess", "checkers", "go"],["cat", "dog", "mouse"];
print $array[0][0], ", ". $array[1][0], ", ", $array[1][0];

