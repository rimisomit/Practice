#! /usr/bin/perl -w
#ex14-183
use Benchmark;

my $count=0;
my $t1=new Benchmark;
for (1..1000000) { ++$count }
my $t2=new Benchmark;
print timestr(timediff $t2,$t1);
print "\n$count";
