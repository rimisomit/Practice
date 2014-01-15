#! /usr/bin/perl -w
#ex5-8
sub addem
	{ $value1 = shift (@_);
if ($#_> 0) {
	$value2 = shift (@_);
} else {
	$value2 = 1;
}
print "$value1 + $value2 = " . ($value1+$value2)
};

addem(2);
