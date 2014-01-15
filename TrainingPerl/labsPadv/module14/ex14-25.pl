#! /usr/bin/perl -w
#ex14-25
$_='abcd';
print "1\n" if /ab(?<=(ab))/;
print $1;

