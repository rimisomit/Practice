#! /usr/bin/perl -w
#ex14-143
$_='abab';
$re=qr/ab/;
print $& if /$re+/;

# but
print "\n\n";

$_='abab';
$re='ab';
print $& if /$re+/;
