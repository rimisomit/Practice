#! /usr/bin/perl -w
#ex5-24
$coderef = sub {print "Hello!\n";};

&{$coderef};
