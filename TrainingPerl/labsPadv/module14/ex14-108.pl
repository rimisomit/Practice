#! /usr/bin/perl -w
#ex14-108
my $a='1';
$_='2';
$^R='a';
print "Found\n" if /^(?{print 'OK '; $a='z'})2$/;
print $^R;
