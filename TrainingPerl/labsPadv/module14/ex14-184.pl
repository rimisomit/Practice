#! /usr/bin/perl -w
#ex14-184
use Benchmark;
$_='Folloew 13 zero\'s: 0000000000000' x 13000;
my $re=qr/(\d+)\D+(??{"0{$1}"})/;
my $t1=new Benchmark;
for (1..1000000)
 { /$re/;
 }
my $t2=new Benchmark;
print timestr(timediff $t2,$t1);
