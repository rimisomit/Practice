#! /usr/bin/perl -w
##ex14-193
print join '-', split /(?=\w)/, "abcd";
