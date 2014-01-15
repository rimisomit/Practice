#! /usr/bin/perl 
#ex6-16
%hash = ( Name => Tommie, ID => 1234, );
$hashreference = \%hash;
print $$hashreference{Name};
