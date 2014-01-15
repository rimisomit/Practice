#! /usr/bin/perl -w
#ex14-192
print grep $_, split '=', '===a=b==c===', -1;
