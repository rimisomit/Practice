#!/usr/bin/perl
# hitakey.pl
use warnings;
use strict;
use Term::ReadKey;
ReadMode 'cbreak';
print "Hit a key: ";
my $selection = ReadKey 0;
print "You typed $selection\n";
ReadMode 'restore';
