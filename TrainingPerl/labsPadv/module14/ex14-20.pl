#! /usr/bin/perl -w
#ex14-20
use strict;
use re 'eval';

$_='abcd';
m!(?{ print "Starting from ".pos($_)."\n" })
  (\w
    (?{ print pos($_)."\n$1\n" })
  )*!x;
