#! /usr/bin/perl -w
#ex12-20
# заменить две строки на одну:
@array = ( ["apples", "oranges"],
	   ["asparagus", "corn", "peas"],
	   ["ham", "chicken"] );
splice @array, 0 ,2 , ["chess", "checkers", "go"];
print $array[0][0], ", ", $array[1][0];
