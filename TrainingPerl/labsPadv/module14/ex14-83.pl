#! /usr/bin/perl -w
#ex14-83

use strict;
no strict 'refs';

sub subr() { return 'abc' }

our $abc=123;
$_="${&subr}";
print $_;

