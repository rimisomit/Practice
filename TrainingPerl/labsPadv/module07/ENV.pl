#! /usr/bin/perl
# ENV
while (($key, $value) = each(%ENV))
{ print "$key => $value\n";}
