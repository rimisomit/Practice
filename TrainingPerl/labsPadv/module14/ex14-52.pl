#! /usr/bin/perl -w
#ex14-52

use strict;
#use locale;

my $s='Tel. 2-3344. Second tel. 3-2233, yet another tel. 4-1122';
my $tel='tel\.\s+[\d-]+';
my $n=1;
$s =~ s/(tel\.\s+)[\d-]+      # ищем слово "tel." + номер
        (?=(?:.*?$tel){$n}    # за которым $n раз идет "tel." + номер
          (?!.*?$tel)         # после чего не встречается "tel." +номер
        )/${1}9-9999/isx;
print $s;
