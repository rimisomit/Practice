#! /usr/bin/perl -w
#ex14-55
$_=<<EOF;
First line 123. 
Second line 456.
Third line 789.
EOF

# not goog
/.*(\d+)/s;
print $1;

print "\n fixed\n";
# fixed 
/.*(?<!\d)(\d+)/s;
print $1;
