#! /usr/bin/perl -w
#ex14-113
$_='aaa';
my $a='(?{print "OK "})';
print "$&" if /^aaa$a$/;
