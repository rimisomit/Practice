#! /usr/bin/perl
use Fcntl;
use NDBM_File;
tie %hash, "NDBM_File", './data', O_RDWR|O_CREAT|O_EXCL, 0644;
$hash{drink} = 'root beer';
$hash{food} = 'apple';
untie %hash;




