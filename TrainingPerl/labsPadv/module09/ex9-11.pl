#! /usr/bin/perl
#ex9-11
$@ = "Overflow error";
warn;

print "\nUsing \'warn\' with args\n";
print "-----------------------\n";
warn "Something", " is", " rotten", " in", " Denmark";


