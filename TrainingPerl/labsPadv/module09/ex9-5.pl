#! /usr/bin/perl
#ex9-5
system "stty raw </dev/tty >&1";
for ($loop_index = 0; $loop_index <= 9; $loop_index++) {
	$char = getc(STDIN);
	print $char;
}
