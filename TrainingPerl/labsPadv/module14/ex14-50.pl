#! /usr/bin/perl -w
##ex14-50
# use locale;
my $s='Tel. 2-3344. Second tel. 3-2233, yet another tel. 4-1122';
my $count=0;
while ($s =~ /tel\.\s+([\d-]+)/gi)
 { if (++$count == 3)
    { print "Third number: $1\n";
    }
 }

