#! /usr/bin/perl
#ex8-23
@array = split /[,\s]\s*/, "Hello, my friends!";
print join ("/ ", @array);
