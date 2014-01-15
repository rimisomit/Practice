#! /usr/bin/perl -w
#ex14-76
$_=<<EOF;
123 abc
-234 def
\$\@ xyz
EOF

while (/\G
(?:(?>[\000-\011\013-\040]+)|   # все от \0 до пробела кроме \n
   (\b(?>[a-zA-Z]+)\b)(?{ print "Name: $^N\n" })|      	# имя
   ((?>[+-]?)(?>\d+)\b)(?{ print "Number: $^N\n" })|   	# число
   (\n)(?{ print "Newline:\n" })|                      	# \n
   ((?>\S+))(?{ print "Unknown: $^N\n" })   		# все остальное
)/gx) {}
