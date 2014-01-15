#! /usr/bin/perl -w
#ex5-23
use subs 'exit';
sub exit
{
	print "Do you really want to exit?";
	$answer = <>;
if ($answer =~ /^y/i) {CORE::exit;}
}

while (1) {
	exit;
}

