#! /usr/bin/perl -w
#ex14-48
while ('12345' =~ /\d/g) { print "Found another number : $&\n" }
