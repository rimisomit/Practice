#! /usr/bin/perl -w
#ex14-36
my $text='123 234 345 456';
my @m=$text =~ /\d+/g;
print join ',',@m;
