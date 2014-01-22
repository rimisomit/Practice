package Module21;
BEGIN
{
use Exporter();
@ISA = qw(Exporter);
@EXPORT = qw(&subroutine1);
}
sub subroutine1 { print "Hello!\n"; }
return 1;
END { }
