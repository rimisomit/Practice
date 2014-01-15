#! /usr/bin/perl 
#ex6-21
sub printem
{ print shift; }
$codereference = \&printem;
$codereference->("Hello! \n");
