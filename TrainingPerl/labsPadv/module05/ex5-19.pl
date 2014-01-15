#! /usr/bin/perl -w
#ex5-19
@a = (1, 2, 3);
@b = (4, 5, 6);
@array = addem(\@a, \@b);

sub addem {
	my ($ref1, $ref2) = @_;
for ($loop_index = 0; $loop_index <= $#{$ref1}; $loop_index++) {
	$result[$loop_index] = @{$ref1}[$loop_index] + @{$ref2}[$loop_index]; 
   }
return @result;
};

print join(",", @array);
