#! /usr/bin/perl -w
#ex9-18
if (open(CHILDHANDLE, "|-")) {
	$SIG{INT} = sub {print "Got the message.\n";};
	sleep 2;
	print CHILDHANDLE "$$";
	sleep 2;
	close (CHILDHANDLE);
} else {
	chomp ($parentid = <>);
	kill INT => $parentid;
	exit;
}
