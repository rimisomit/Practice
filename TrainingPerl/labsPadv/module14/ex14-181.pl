#! /usr/bin/perl -w
#ex14-181
use Benchmark;
$_=' <pppp>' x 13000;
$_.='<table>a';
my $re=qr
/[^\s<>]
 (?![^<>]*>)
/x;
my $t1=new Benchmark;
for (1..1000000)
 { /$re/;
 }
my $t2=new Benchmark;
print timestr(timediff $t2,$t1);
