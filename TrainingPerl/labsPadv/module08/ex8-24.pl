#! /usr/bin/perl
#ex8-24
$value = 1234.56789;
print sprintf "X=%.4f\n", $value;

print sprintf "Y=%.5f\n",$value;

print sprintf "z=%6.6f\n", $value;

print sprintf "W=%+.4e\n", $value;
