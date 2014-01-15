#! /usr/bin/perl
#ex12-41
%hash = (
	fruits => ["apples", "oranges"],
	vegetables => ["corn", "peas", "turnips"],
	meat => ["chicken", "ham"],
);

for $key (sort keys %hash) {
	print "$key:\t[", join(", ", @{$hash{$key}}), "]\n";
}
