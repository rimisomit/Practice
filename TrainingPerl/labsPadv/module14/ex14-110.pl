#! /usr/bin/perl -w
#ex14-110
$a='1';
print "$&" if $a =~ /^1$/;

# but

print "\n\n\";

$a='1';
print "$&" if $a =~ /^1(?{$a='z'})$/;
