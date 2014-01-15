#! /usr/bin/perl -w
#ex14-142
$_='aB';
$re=qr/(?i)[a-z]+/;
print $& if /${re}b/;

# but
print "\n\n";

$_='aB';
$re=qr/(?i)[a-z]+/;
print $& if /${re}B/;
