#! /usr/bin/perl -w
#ex14-100
$_='aa';
my $n=1;
/^(a{${\($n+1)}})$/;
print $1;
