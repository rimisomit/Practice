#! /usr/bin/perl -w
#ex9-18
if (open(CHILDHANDLE, "|-")) {
	$SIG{INT} = sub {print "Got the message.\n";};
	print CHILDHANDLE "$$";
	close (CHILDHANDLE);
} else {
	chomp ($parentid = <>);
	kill INT => $parentid;
	exit;
}
