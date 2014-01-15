#! /usr/bin/perl -w
#ex14-112
my $a='1';
$_='2';
print "\$&=$&\n" if $a =~ /^1(?{$_='z'; print "\$_=$_ \$a=$a\n"})$/;
print "\$_=$_ \$a=$a";
