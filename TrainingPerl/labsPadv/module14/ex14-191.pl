#! /usr/bin/perl -w
#ex14-191
print grep { length } split '=', '===a=b==c===', -1;
