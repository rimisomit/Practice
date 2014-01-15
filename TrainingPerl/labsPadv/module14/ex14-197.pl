#! /usr/bin/perl -w
#ex14-197
$_=<<EOD;
<b>bold text</b>
plain text
<i>italic</i>
<h1> header </h1>
plain text
EOD

print join '-', split /(<[^>]+>)/;

