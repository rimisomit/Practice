#! /usr/bin/perl -w
#ex14-54

$text ='.First symbol is a period';
if ($text =~ /^\./) { print "The text should not begin with a period!\n" }


$_=<<EOF;
First line.
Seconf line.
Third line.
EOF

s/^/ /gm; # Insert one space character at the beginning of each line of text.
print $_;

$_=<<EOF;
First line.



Seconf line.
Third line.
EOF

s/^\n//gm; # remove empty lines
print $_;
