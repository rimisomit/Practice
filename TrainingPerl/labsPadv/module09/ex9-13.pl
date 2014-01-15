#! /usr/bin/perl
#ex9-13
open(FILEHANDLE, "printem |");
while (<FILEHANDLE>) { print; }
close (FILEHANDLE);
