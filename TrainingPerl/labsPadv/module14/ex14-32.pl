#! /usr/bin/perl -w
#ex14-32
my $date='2010/3/12';
if (my($year,$month,$day)=$date =~ m!^(\d+)/(\d+)/(\d+)$!) { 
	print "Year=$1, month=$2, day=$3";
 } else { 
	print 'Not found!';
  }
