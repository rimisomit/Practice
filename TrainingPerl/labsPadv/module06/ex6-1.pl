#! /usr/bin/perl -w
#ex6-1
$variable1 = 5;
$reference = \$variable1;
print $$reference;
