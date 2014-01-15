#! /usr/bin/perl -w
#ex14-31
my $url='var1=value1&var2=value2';
my @pairs=$url =~ /(\w+)=(\w+)&(\w+)=(\w+)/;
print join ',',@pairs;
