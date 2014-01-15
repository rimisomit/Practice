#! /usr/bin/perl
#ex3-18

$variable = (3, 4, 5);
print $variable . " in scalar context\n"; 	# scalar context

@array = (3, 4, 5); 	# list's context
print join(",", @array) . " in list's context\n";

