#! /usr/bin/perl -w
##ex14-166

use strict;

my ($len,$d,$res)=(0);
$_='0123 1234345678910 ';
no warnings;

/((\d)
   (?{$d=$+})
   (?>
       (??{ ++$d < 10 ? "$d" : "(?!)" })*
   )
 )
 (?{                  	# Эти символы нельзя разделять
  if (length $1 > $len)
   { $len=length $1;
     $res=$1;
   }
 }) # Эту скобку нельзя отделять от предыдущей скобки "}"
 (?!)
 /x;
print $res if defined $res;
