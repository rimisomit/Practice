#! /usr/bin/perl -w
#ex14-165
$_='abc';
print 'OK' if /ab(??{'*'})/;
