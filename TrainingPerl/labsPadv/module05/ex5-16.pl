#! /usr/bin/perl -w
#ex5-16
sub BEGIN
{
my $count = 0;
sub incrementcount {
	return ++$count;
	};
}
print incrementcount . "\n";
print incrementcount . "\n";
print incrementcount . "\n";
print incrementcount . "\n";
