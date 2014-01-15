#! /usr/bin/perl -w
#ex14-69
$_='abcd';
pos($_)=1;
/\w/g;
print "$&\n";
pos($_)=1;
print /\w/g;
