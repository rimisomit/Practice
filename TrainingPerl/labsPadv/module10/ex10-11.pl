#! /usr/bin/perl
#ex10-11
$filename = "./file.txt";
($dev, $ino, $nlink, $uid, $gid, $rdev, $size, $atime,  
 $mtime, $ctime, $blksize, $blocks) = stat ($filename);
print "$filename is $dev and $size bytes long.";



