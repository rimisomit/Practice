#! /usr/bin/perl -w
#ex12-27
for $key ("hash1", "hash2", "hash3")
	{ $hash{$key} = {$returnlist}; }

sub returnlist {return (key1 => value1, key2 => value2);};

print $hash{hash1}{key2};
