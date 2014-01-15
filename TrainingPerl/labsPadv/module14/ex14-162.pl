#! /usr/bin/perl -w
#ex14-162
$re=qr/<a\s+href="([^"]+)"/i;
$_='<a href="http://www.knowledgeforit.com">';
print $1 if /$re/;
