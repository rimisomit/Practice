#! /usr/bin/perl -w
#ex14-80
my @a=([1,2],[3,4]);
$_="abc@{a}def";
print $_;
