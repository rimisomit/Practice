#! /usr/bin/perl
#ex8-10
$hash{sandwich} = salami;
$hash{drink} = 'rot beer';
foreach $key (keys %hash){
	print $hash{$key} . "\n";
}
