#! /usr/bin/perl -w
#ex14-30
print "\$+=$+, \$^N=$^N"
 if "abcd" =~ /(a(bc)(d)(?{ print "\$+=$+, \$^N=$^N\n" }))/;
