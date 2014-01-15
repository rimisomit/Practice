#! /usr/bin/perl
#ex8-21
@array = ('z','b','a','x', 'y','c');
print join (", ", sort @array) . "\n";

print join (", ", sort {$a cmp $b} @array) . "\n";

print join (", ", sort {$b cmp $a} @array) . "\n";

@array = (1, 5, 6, 7, 3, 2);
print join (", ", sort {$a <=> $b} @array) . "\n";

print join (", ", sort {$b <=> $a} @array) . "\n";
