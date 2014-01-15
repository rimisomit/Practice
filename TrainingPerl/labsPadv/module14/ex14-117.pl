#! /usr/bin/perl -w
#ex14-117
$_='Date1 Jan 13 2010, Date2 Apr 5 2010';
while (/(?=[ADFJMNOS])(?{print pos($_).' '})
  (?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)(?:\s+\d+){2}/g)
 { print "\nFound date $&\n";
 }
