#! /usr/bin/perl -w
#ex14-169
$_='a{b{c}d}e';
my $level0=qr/(?>[^{}]*)/;
my $level1=qr/(?>(?>[^{}]+)|\{$level0})*/;
s/\{$level1}//g;
print $_;

