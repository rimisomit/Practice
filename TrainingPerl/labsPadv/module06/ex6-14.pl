#! /usr/bin/perl 
#ex6-14
sub printem
	{ print "Hello!\n"; };
$codereference = *printem{CODE};
&$codereference;
