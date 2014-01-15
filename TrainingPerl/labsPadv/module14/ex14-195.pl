#! /usr/bin/perl -w
#ex14-195
split /(\w)(?{ print "=$1=" })/, "abcd";
