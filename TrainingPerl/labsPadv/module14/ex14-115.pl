#! /usr/bin/perl -w
#ex14-115
$_='Date1 Jan 13 2010, Date2 Apr 5 2010';
while (/(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)(?:\s+\d+){2}/g)
 { print "Found date $&\n";
 }
