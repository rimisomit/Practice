#! /usr/bin/perl -w
#ex14-123
$_='( () ) ( ) (()())';
my $ctop=0;
if (/     ^
          (?>
             (?: (?> [^()]+ )
                 | \( (?{ ++$ctop })
                 | \) (?(?{ $ctop }) (?{ --$ctop }) | (?!) )
             )*
          )
          (?(?{ $ctop }) (?!) )
          $
    /x
   )
        { print 'Match' } else { print 'Not match' }
