#! /usr/bin/perl
#ex14-9
use strict;

my $text='<a target="_blank" href="http://www.knowledgeforit.com/">Internet-training</a>';

if ($text =~ m#<a\s+[^>]*?href\s*=\s*["']?([^"'> ]+)["']?[^>]*>[^<]+</a>#i) { print $1 }

