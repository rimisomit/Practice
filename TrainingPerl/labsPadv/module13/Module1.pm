#! /usr/bin/perl 
package Module1;
BEGIN {
	use Exporter ();
	@ISA = 'Exporter';
	@export = '&subroutine1'; }

sub subroutine1 { print "Hello!\n"; }
return 1;

END { }

