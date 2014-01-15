#! /usr/bin/perl -w
#ex14-56
$_='abcd';
print "$`|$&$'" if /(z?)*/;
