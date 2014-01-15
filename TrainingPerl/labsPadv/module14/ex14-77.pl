#! /usr/bin/perl -w
#ex14-77

use strict;
use bytes;
# use locale;

$_=<<EOF;
<html>
<body>
&lt;word1 
word2 1234&gt;
<a href="http://www.knowledgeforit.com">The reference</a>
</body>
</html>
EOF

my $close_a=0;
while (!/\G\z/gc)
 { if (/\G<(\w+)[^>]*>\s*/gc)
    { print "Tag $^N opened\n";
      if ($^N =~ /^a$/i)
       { print "Error: a nested tag A\n" if $close_a++;
       }
    }
    elsif (m!\G</(\w+)[^>]*>\s*!gc)
     { print "Tag $^N closed\n";
       if ($^N =~ /^a$/i)
        { print "Error: no matching tag A\n" if !$close_a--;
        }       
     }
     elsif (/\G(\w+)\s*/gc)
      { print "Found word/number $^N\n";
      }
      elsif (/\G(&#?\w+;)\s*/gc)
       { print "Found subs. $^N\n";
       }
       # Пропускаем все кроме тегов, слов и подстановок
       elsif (/\G[^<>&\w]+/gc)
        {
        }
        else
            # Нашли ошибку, сделаем сообщение об этом
         { my $offset=pos($_);
           my ($error)=$_ =~ /\G.{1,10}/gs;
           die "Strange characters\n$error\n in pos. $offset\n";
         }
 }
print "There is an unclosed tag A\n" if $close_a;
