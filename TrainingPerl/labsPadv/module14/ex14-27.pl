#! /usr/bin/perl -w
#ex14-27
my $text='<a target="_blank" href="http://www.knowledgeforit.com/">Internet-training</a>';
if ($text =~
 m!<a\s+[^>]*?href\s*=\s*
  (["'])?  # совпадение для разделителя (', " или пусто). Запомнить его
  ([^"'>\x20]+)      # ссылка (все кроме пробела, ' и ")
  (?(1)\1)   # если был разделитель, то подставляем шаблон для него
  [^>]*>[^<]+</a>!ix) { print $2 }

