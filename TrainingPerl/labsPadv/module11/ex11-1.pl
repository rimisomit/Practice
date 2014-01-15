#! /usr/bin/perl
#ex11-1
use POSIX;
use Term;
$termios = POSIX::Termios->new;
$termios->getattr;
$speed = $termios-getospeed;
$termcap = Term::Cap->Tgetent({Term => undef, OSPEED => $speed});
$termcap->Tputs('cl', 1, *STDOUT);
$termcap->Tqoto('cm', 40, 5, *STDOUT);
print "Perl\n";
