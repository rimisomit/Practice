#! /usr/bin/perl -w
#ex14-163
my $url;
my $re=qr/<a\s+href="([^"]+)(?{$url=$^N})"/i;
$_='<a href="http://www.knowledgeforit.com">';
print $url if /$re/;
