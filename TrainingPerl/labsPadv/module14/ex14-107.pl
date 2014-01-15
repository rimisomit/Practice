#! /usr/bin/perl -w
#ex14-107
$_='Andrey';
$name='aNDreY';
print $& if /\u\L$name\E/;

# for classes
print "\n\n";

$_='Andrey';
$name='aNDreY';
print $& if /[\u\L$name\E]{6}/;
