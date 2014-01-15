#! /usr/bin/perl -w
#ex14-182
use Benchmark;
$_=' <pppp>' x 13000;
$_.='<table>a';
my $count=0;
my $re=qr
/[^\s<>]
 (?![^<>]*>)
 (?{ ++$count })
/x;
my $t1=new Benchmark;
for (1..1000000)
 { /$re/;
 }
my $t2=new Benchmark;
print timestr(timediff $t2,$t1);
print "\n$count";
