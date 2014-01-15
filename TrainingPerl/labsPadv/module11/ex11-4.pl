#! /usr/bin/perl
#ex11-4
use POSIX 'strftime';
print strftime "Here's the date: %d/%m/%Y\n", localtime;
