#! /usr/bin/perl -w
#ex14-101
$_='[a]bc$ ';
print "'$&'" if /^\Q[a]bc$ \E$/;
