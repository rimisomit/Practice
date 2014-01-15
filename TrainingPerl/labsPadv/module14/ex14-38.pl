#! /usr/bin/perl -w
#ex14-38
my $text='123 234 345 456';
$text =~ s/\d+/reverse $&/ge;
print $text;
