#! /usr/bin/perl -w
#ex5-18
sub outer {
	sub inner { print "Inside the inner subroutine.\n"; }
  inner;
}
outer;
inner;

