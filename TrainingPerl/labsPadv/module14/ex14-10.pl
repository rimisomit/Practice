#! /usr/bin/perl
#ex14-10
use strict;

my $text='<a target="_blank" href="http://www.knowledgeforit.com/">Internet-training</a>';
if ($text =~ m#<a\s+[^>]*?href\s*=\s*(["']?)([^"'> ]+)\1[^>]*>[^<]+</a>#i) { print $2 }
