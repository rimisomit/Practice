#! /usr/bin/perl -w
#ex14-103
$\='?';
$_='[a]bc?E$';
print $& if /^\Q[a]bc$\E$/;
