#! /usr/bin/perl
#ex8-14
@array = (a, b, c, d, e, f);
@array = map(uc, @array);
print join(", ", @array);

