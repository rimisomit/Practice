#! /usr/bin/perl
#ex7-11
use File::Copy;
copy("nonexistent.pl", "new.pl");
print $!;
print $^E;
