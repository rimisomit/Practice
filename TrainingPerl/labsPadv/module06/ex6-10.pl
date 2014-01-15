#! /usr/bin/perl 
#ex6-10
$hashreference = {
	Name => Tommie,
	ID => 1234,
};

print $$hashreference {Name};
