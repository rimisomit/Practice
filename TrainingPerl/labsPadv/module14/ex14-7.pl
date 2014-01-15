#! /usr/bin/perl
#ex14-7
$text= '<a href="http://www.knowledgeforit.com/">Internet-training</a>';
$text =~ m#<a\s+href="([^"]+)">[^<]+</a>#i;
print $1;
