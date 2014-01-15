#! /usr/bin/perl
#ex8-25
$text = "Here is the text.";
print substr ($text, 12) . "\n";

print substr ($text, 12, 4) . "\n";

print substr ($text, 12, 4, "word") . "\n";
print $text;
