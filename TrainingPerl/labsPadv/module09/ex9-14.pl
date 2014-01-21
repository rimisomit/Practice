#! /usr/bin/perl
#ex9-14
open (FILEHANDLE, "| ./readem");
print FILEHANDLE "HELLO!";
close (FILEHANDLE);
