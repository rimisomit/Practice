#! /usr/bin/perl -w
#ex5-20
@a = (1, 2, 3);
@b = (4, 5, 6);
sub addem {
	local (*array1, *array2) = @_;
for ($loop_index = 0; $loop_index <= $#array1; $loop_index++) {
	$result[$loop_index] = $array1[$loop_index] + $array2[$loop_index]; 
	}
return @result;
}

@array = addem (\@a, \@b);
print join(',', @array);
