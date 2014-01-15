#! /usr/bin/perl 
#ex6-25
sub printem { my $strinq1 = shift;
return sub { my $strinq2 = shift;print "$string1 $string2\n";}; };

$hello = printem("Hello");

&$hello("today.");
&$hello("there.");
