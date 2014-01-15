#! /usr/bin/perl -w
#ex14-22
print "bb" =~ /^b(?#aaaaa){2}$/;

#error:
#print "bb" =~ m#^b(?#aaaaa){2}$#;

#correct
print "bb" =~ m#^b(?\#aaaaa){2}$#;

# using "x"
print "bb" =~ 
/^          # Это начало строки
  b         # Далее идет символ b
   {2}      # За ним следует квантификатор
      $     # И в конце - конец строки
/x;
