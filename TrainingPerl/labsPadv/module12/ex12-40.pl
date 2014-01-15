#! /usr/bin/perl
#ex12-40
push @{%hash{fruits}}, "apples", "oranges";
push @{%hash{vegetables}}, "corn", "peas", "turnips";
push @{%hash{meat}}, "chicken", "ham";
print $hash{fruits}[0];
