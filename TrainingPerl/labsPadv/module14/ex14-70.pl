#! /usr/bin/perl -w
#ex14-70
$_='abcd';
pos($_)=1;
/\G\w/g;
print "$&\n";
pos($_)=1;
print /\G\w/g;
