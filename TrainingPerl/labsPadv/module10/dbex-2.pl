#! /usr/bin/perl
use Fcntl;
use NDBM_File;

tie %hash, "NDBM_File", './data', O_RDWR, 0644;
print $hash{drink};
untie %hash;




