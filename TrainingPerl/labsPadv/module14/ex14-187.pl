#! /usr/bin/perl -w
#ex14-187
print join '-',split ' ', '       a      b     c      de       ';
print "\n\n";
print join '-',split m/\s+/, '       a      b     c      de       ';
