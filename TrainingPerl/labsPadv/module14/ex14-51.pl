#! /usr/bin/perl -w
#ex14-51
#use locale;

my $s= 'Tel. 2-3344. Second tel. 3-2233, yet another tel. 4-1122';
my $count=0;
$s =~ s/(tel\.\s+)([\d-]+)/
     ++$count == 3 ? "${1}9-9999" : "$1$2"
    /egi;
print $s;


