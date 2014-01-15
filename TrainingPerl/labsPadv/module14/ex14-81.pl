#! /usr/bin/perl -w
#ex14-81
my @a=([1,2],[3,4]);
$_="abc@{$a[0]}@{$a[1]}def";
print $_;
