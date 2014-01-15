#! /usr/bin/perl -w
#ex14-164
$_='abc';
print 'OK' if /ab(??{'c'})/;
