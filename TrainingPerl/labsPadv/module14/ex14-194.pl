#! /usr/bin/perl -w
#ex14-194
#!/usr/bin/perl -w
use strict;
scalar split /(?=\w)/, "abcd";
print @_;
