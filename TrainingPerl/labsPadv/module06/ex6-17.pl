#! /usr/bin/perl 
#ex6-17
sub printem
{
	print shift;
}
$codereference = \&printem;
$codereference -> ("Hello!\n");
