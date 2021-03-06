#! /usr/bin/perl
# 
use IO::Socket; 		  # модуль работы с сокетами 
my $server_host = '10.17.162.90';    # адрес сервера
my $server_port = 5555;            # и порт на нем
my $socket = IO::Socket::INET->new(   # создаем сокет
      Type     => SOCK_STREAM,       # для потокового обмена 
      Proto    => 'tcp',              # по протоколу TCP
      PeerAddr => $server_host,      # с удаленным адресом      
      PeerPort => $server_port)      # и портом
or die "Connection error $server_host:$server_port ($@)";
                                  # сообщение задается
my $message = $ARGV[0] ||         # параметром программы
              "Ping! Ping!";  # или умолчанием
print $socket "$message\n";       # отправляем его и
my $answer = <$socket>;           # принимаем ответ
print "$answer";                  # выводим ответ
close $socket;                    # и закрываем сокет
