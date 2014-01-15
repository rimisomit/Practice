#! /usr/bin/perl -w
#ex14-75
my $text='123 234 345 456';
while ($text =~ /\d+/g) { print "Foun number $&\npos=".pos($text)."\n" }
