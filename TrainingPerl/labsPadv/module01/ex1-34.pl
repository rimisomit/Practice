#! /usr/bin/perl
#ex1-34
print "\nsort\n";
print sort {$a cmp $b} ("c", "b", "a"); # expected abc

# Можно сортировать список в обратном порядке:

print "\nreverse order sort\n";
print sort {$b cmp $a} ("c", "b", "a"); # expected cba


# Можно использовать числовое сравнение для сортировки значений:

print "\nnum cmp sort\n";
print sort {$a <=> $b} (3, 2, 1); # expected 123

# Наконец, тот же код можно поместить в подпрограмму:

print "\nusing func sort\n";

sub myfunction {
	return (shift(@_) <=> shift(@_));
};

print sort myfunction (3, 2, 1); # expected 123

# что эквивалентно блоку

print "\nusing block sort\n";
print sort {myfunction($a, $b)} (3, 2, 1); # expected 123








