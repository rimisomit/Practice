#! /usr/bin/perl
# SIG-handler
# New signal-handler for  INT
$SIG{INT} = \&sig_handler;    # ref to sub

# main body
 while (1) {sleep(1); print "I am working hard...\n";} # unlim loop

sub sig_handler { # sub-signal-handler
   $SIG{INT} = \&sig_handler; # reset handler
   print "INT signal received, somebody press Ctrl+C\n"; 
   print "I finishing!\n"; 
   # exit; # end of the program
}
