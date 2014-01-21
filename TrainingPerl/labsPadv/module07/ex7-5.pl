#! /usr/bin/perl
#ex7-5
$text = "Here \nis the \ntext.";
$text =~ /^is/;
print $&;		# Совпадение не найдено
$* = 1;
$text =~ /^text/;
print $&;		# Совпадение найдено
print 'test'