#! /usr/bin/perl -w
#ex14-158
$_=1;
{ local $_=2;
  print "$_\n";
}
print "$_\n";

