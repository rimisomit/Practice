package Module211;

BEGIN
{
	use Exporter();
	@ISA = qw(Exporter);
	@EXPORT_OK = qw(&subroutine1);
}

sub subroutine1 { print "Hello!\n"; }
return 1;

END { }
