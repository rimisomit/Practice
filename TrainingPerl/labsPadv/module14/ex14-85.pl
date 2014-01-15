#! /usr/bin/perl -w
#ex14-85

@a=([1,2],[3,4]);
$_="abc${\(join \",\",(@{$a[0]},@{$a[1]}))}def";
print $_;

# or - another style, using @{[ list ]}:
print "\n\n";

@a=([1,2],[3,4]);
$_="abc@{[join ',',(@{$a[0]},@{$a[1]})]}def";
print $_;

