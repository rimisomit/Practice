#! /usr/bin/perl -w
##ex14-57
$_='abcd';
s/.??/<$&>/g;
print $_;
