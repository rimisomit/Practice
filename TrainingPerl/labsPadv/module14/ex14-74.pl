#! /usr/bin/perl -w
#ex14-74
$_='12991234';
@a=/\G(?:(?!99)\d{4})*(99\d\d)/g;
print @a;

# The right solution

$_='129912349934';
@a=/\G(?:(?!99)\d{4})*(99\d\d)/g;
print @a;
