#! /usr/bin/perl -w
#ex14-102

use strict;

$_='[a]bcE$';
print $& if /^\Q[a]bc$\E$/;
