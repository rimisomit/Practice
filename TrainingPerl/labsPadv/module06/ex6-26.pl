#! /usr/bin/perl 
#ex6-26
@greetings = ("Hello", "Hi", "Greetings");
foreach my $term (@greetings)
	{ *{"print" . $term} = sub {print "$term\n"}; }
printHello();
printHi();
printGreetings();
