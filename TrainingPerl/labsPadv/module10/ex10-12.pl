#! /usr/bin/perl
#ex10-12
use POSIX;
$filename = "file.txt";
$descrip = POSIX::open($filename, POSIX::O_RDONLY);
($dev, $ino, $undev, $nlink, $uid, $gid, $rdev, $size, $atime,
$mtime, $ctime, $blksize, $blocks) = POSIX::fstat($descrip);
print "$filename is $undev and $size bytes long.";



