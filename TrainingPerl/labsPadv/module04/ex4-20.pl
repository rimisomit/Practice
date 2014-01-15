#! /usr/bin/perl
##ex4-20
#	$trip this line
#	$trip this line too
COMMENTS: while (<>) {
		last COMMENTS if !/^#/;
	}
do { print; }
while (<>);


