#! /usr/bin/perl
# 
use Socket; 				   # модуль работы с сокетами
my $host_name = 'www.perl.com';            # по имени хоста
my $address = gethostbyname($host_name);   # узнаем адрес и
my $ip_address = inet_ntoa($address);      # преобразуем его
print "$ip_address $host_name\n";          # в строку

# результат: 208.201.239.36 www.perl.com 

$address = inet_aton($ip_address);         		# и обратно
my $host_name = gethostbyaddr($address,AF_INET);	# узнаем имя
print "$ip_address $host_name\n";          		# по адресу

# результат: 208.201.239.36 www.perl.com

