#! /usr/bin/perl
#ex7-2
use File::Copy;
# Попытка скопировать несуществующий файл
copy ("nonexistent.pl", "new.pl");
print $!;
