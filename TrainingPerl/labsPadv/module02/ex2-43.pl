#! /usr/bin/perl -w
#ex2-43
$data = "Here is the data.";
@data = (1, 2, 3);
*alsodata=\$data; 	# for scalars only
print "$alsodata\n";

print @alsodata; # doesn't work




