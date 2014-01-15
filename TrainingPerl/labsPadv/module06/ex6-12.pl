#! /usr/bin/perl 
#ex6-12
$codereference = sub {print shift};
&{$codereference}( "Hello!\n");
