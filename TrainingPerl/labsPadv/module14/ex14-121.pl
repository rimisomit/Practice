#! /usr/bin/perl -w
#ex14-121
my ($n,$tmp);
$_='-200 0 36 35';
while(
/(-)?				# берем минус в $1, если он есть
 (\d+)				# берем число в $2
 (?{ $tmp=$1 ? -$2 : $2;	# в $tmp получаем число с учетом знака
     $n=$tmp if !defined $n || $n < $tmp;
 })
/gx) {};
print "The largest number is $n" if defined $n;
