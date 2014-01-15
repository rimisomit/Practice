#! /usr/bin/perl -w
#ex14-44
$_="a\r\nb";
print '1' if m'a\r$\n'm;
