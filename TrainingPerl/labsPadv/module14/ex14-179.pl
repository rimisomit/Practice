#! /usr/bin/perl -w
#ex14-179
use Benchmark;
$_=' <pppp>' x 13000;
$_.='<table>a';
my $re=qr
/\A				# начало текста
    (?>				# атомарная группировка
        (?:			# цикл пропуска пробелов и тегов
            (?>\s*)		# пропустить пробельные символы
            <(?>[^>]*)>		# пропустить тег с его содержимым
        )*		     # повтор любое число раз
    )
    \S				# и вот он наконец - непробельный символ
/x;
my $t1=new Benchmark;
for (1..1000000)
 { /$re/;
 }
my $t2=new Benchmark;
print timestr(timediff $t2,$t1);
