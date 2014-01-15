#! /usr/bin/perl -w
#ex14-172
$_=<<EOD;
aa<table>
 <tr>
ff<table>
  <tr>
 </table>
 <tr>
</table>bb
ssssssss
<table>
</table>
EOD

my $levelN;
$levelN=qr
"(?>
  (?:(?!</?table).)+|  # все символы до фрагмента </?table
  <table[^>]*>(??{$levelN})</table> # или вся следующая таблица
 )*         # сколько угодно раз
"isx;

my @tables=m"<table[^>]*>$levelN</table>"gi;
print join "\n--\n",@tables if @tables;
