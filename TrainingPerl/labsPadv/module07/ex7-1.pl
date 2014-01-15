#! /usr/bin/perl
#ex7-1
$text = "earlynowlate";
$text =~ /now/;
print "Prematch: \"$`\" " . "Match: \"$&\" " . "Postmatch: \"$'\"\n";
