#! /usr/bin/perl -w
#ex5-22
sub swapxy {
	my @data = @_;
for (@data) {
	s/x/y/g;
}
return wantarray ? @data : $data[0];
}

$a = "xyz";
$b = "xxx";
($a, $b) = swapxy($a, $b);
print "$a\n";
print "$b\n";
