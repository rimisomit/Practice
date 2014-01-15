#! /usr/bin/perl
#ex7-13
$text = "text";
$text =~ /x(?{$variable1 = 5})/;
print $^R;
