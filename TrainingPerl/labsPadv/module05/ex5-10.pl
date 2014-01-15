#! /usr/bin/perl -w
#ex5-10
sub getval
{
return 1, 2, 3, 4, 5, 6, 7, 8;
};

@array = getval;
print join(", ", @array);
