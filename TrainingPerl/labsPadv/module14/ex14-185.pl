#! /usr/bin/perl -w
#ex14-185
use Benchmark;
$_='Follow  13 zero\'s: 0000000000000' x 13000;
my $re=qr
/(\d+)\D+\d+/;
my $t1=new Benchmark;
for (1..1000000)
 { /$re/;
 }
my $t2=new Benchmark;
print timestr(timediff $t2,$t1);
