#! /usr/bin/perl
#ex12-10
$string = "Here is a string";
@array = (1, 2, 3);
%hash = ('fruit' => 'apples', 'vegetables' => 'corn');

sub printem
{
	print shift;
}

$complex = {
		string		=> $string,
		number		=> 3.1415926,
		array		=> [@array],
		hash		=> {%hash},
		arrayreference	=> \@array,
		hashreference	=> \%hash,
		sub		=> \&printem,
		anonymoussub	=> sub { print shift; },
		handle		=> \*stdout
};

print $complex->{string}, "\n";
print $complex->{number}, "\n";
print $complex->{array}[0], "\n";
print $complex->{hash}{fruit}, "\n";
print ${$complex->{arrayreference}}[0], "\n";
print ${$complex->{hashreference}}{fruit}, "\n";

$complex->{sub}->("subroutine call.\n");
$complex->{anonymoussub}->("Anonymous subroutine.\n");
print {$complex->{handle}} "Printed Text.", "\n";
