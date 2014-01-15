#! /usr/bin/perl
#ex14-8
$text= '<a href="http://www.knowledgeforit.com/">Internet-training</a>';
if ($text =~ m#<a\s+href\s*=\s*["']?([^"'> ]+)["']?>[^<]+</a>#i) 
		{ print $1 }
