#! /usr/bin/perl
#ex14-6
$text= '<a href="http://www.knowledgeforit.com/">Internet-training</a>';
$text =~ m#<a href="([^"]+)">[^<]+</a>#;
print $1;
