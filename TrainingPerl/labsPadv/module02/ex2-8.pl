#! /usr/bin/perl
#ex2-8
@array = ('0', '1', '2', '3', '4', '5', '6', '7',
'8', '9', 'A', 'B', 'C', 'D', 'E', 'F');
while (<>) { $hex = $array[$_];
print "$hex\n"; }


