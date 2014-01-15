#! /usr/bin/perl -w
#ex14-37
my $text='123 234 345 456';
$text =~ s/\d+/a/;
print $text;
