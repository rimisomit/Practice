#! /usr/bin/perl
#ex14-3
$text='<b>This is bold.</b> This is plaint <b>This is bold again</b>';
#print $text;
print "\n";
print $text =~ /<b>.+<\/b>/;
print "\n";
print $text;


