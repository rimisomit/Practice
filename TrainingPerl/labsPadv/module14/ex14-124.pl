#! /usr/bin/perl -w
#ex14-124
$_=<<EOF;
  <Table> <tr><td>
    <Table> <tr><td> </td></tr>
    </TABLE>
 </td></tr>
 </TABLE>
EOF
my $ctop=0;
if (m%  ^
        (?>
          (?: (?> (?: (?! <table|</table ) .)+ )
              | <table (?{ ++$ctop })
              | </table (?(?{ $ctop }) (?{ --$ctop }) | (?!) )
             )*
          )
          (?(?{ $ctop }) (?!) )
          $
     %isx
   )
        { print 'Match' } else { print 'Not match' }
