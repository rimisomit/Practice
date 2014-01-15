#! /usr/bin/perl
#ex3-16
while (<>)
	{print $_ < 10 ? $_ : "${\((a, b, c, d, e, f)[$_ - 10])}\n";
}
