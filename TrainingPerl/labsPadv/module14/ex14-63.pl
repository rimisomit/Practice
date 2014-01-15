#! /usr/bin/perl -w
#ex14-63
$_='abcd';
s/\Gz*/!/g;
print $_;
