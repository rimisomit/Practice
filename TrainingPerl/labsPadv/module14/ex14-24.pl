#! /usr/bin/perl -w
#ex14-24
$_='abc';
print "1\n" if /a(?=(b))bc/;
print $1;
