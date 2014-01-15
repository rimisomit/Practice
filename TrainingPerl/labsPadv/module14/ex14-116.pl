#! /usr/bin/perl -w
#ex14-116
$_='Date1 Jan 13 2010, Date2 Apr 5 2010';
while (/(?{print pos($_).' '})(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)
   (?:\s+\d+){2}/g)
 { print "\nound date $&\n";
 }
