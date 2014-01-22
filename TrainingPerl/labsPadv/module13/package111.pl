package package111;
sub BEGIN { $text = "Hello!\n"; }
sub subroutine1 { print $text; }
return 1;
sub END
{
	print "Thank you for using package! \n";
}
