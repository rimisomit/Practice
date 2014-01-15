#! /usr/bin/perl -w
#ex14-104
$_='[a]\\Qbc$\\';
my $a='[a]\\Qbc$\\';
print $& if /^\Q$a\E$/;
