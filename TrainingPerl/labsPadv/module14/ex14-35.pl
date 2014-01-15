#! /usr/bin/perl -w
#ex14-35
my $text='123 234 345 456';
my @m=$text =~ /(\d+)(\s+)/g;
print @m;
