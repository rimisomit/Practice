#! /usr/bin/perl
#ex11-5
use Benchmark;
$timestamp1 = new Benchmark;
for ($loop_index= 0; $loop_index < 1_000_000; $loop_index++)
{ $variable1 = 1; }
$timestamp2 = new Benchmark;
$timedifference = timediff($timestamp2, $timestamp1);
print "The loop took ", timestr($timedifference);
