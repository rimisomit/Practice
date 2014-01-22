#! /usr/bin/perl
# 
my $parent = $$;  # PPID
my $pid = fork(); # 'fork' current process
		  # fork will ret  PID chiel in prrent and  0 in chield 
die "fork does not work: $!" unless defined $pid;

if ($pid) { # ---------- parent process ----------
   print "Paret started PID $$\n";
   for (1..3) {
      print "Parent  PID $$ is working $_\n";
      print "Parent  PID $$ sended a signal\n";
      kill HUP, $pid;
      sleep 2;       # 'sleep'  2 sec
   }
   print "Parent finished (PID $$)\n";
}

unless ($pid) { # ---------- chield process ----------
   my $counter = 0;  # received signals counter
   $SIG{HUP} = sub { ### signal handler ###
      $counter++;
      print "\tchield received $counter-th signal!\n"; 
   };                ### end of the signal-handler ###
   print "\tChield started PID $$ the paren is $parent\n";
   for (1..7) {
      print "\tChield  PID $$ is working $_\n";
      sleep 1;       # 'slepp'  1 sec
   }
   print "\tChield finished PID $$\n";
}

