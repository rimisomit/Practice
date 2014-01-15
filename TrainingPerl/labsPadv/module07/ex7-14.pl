#! /usr/bin/perl
#ex7-14
$text = "Here is the text.";
$text =~ /is the (\w+)/;
print $+;
