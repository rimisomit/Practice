#! /usr/bin/perl
#ex12-42
$buffer[0]{$next} = 1;
$buffer[0]{$data} = 0;
$buffer[1]{$next} = 2;
$buffer[1]{$data} = 0;
$buffer[2]{$next} = 3;
$buffer[2]{$data} = 0;
$buffer[3]{$next} = 0;
$buffer[3]{$data} = 0;
$head = 0;
$tail = 0;

sub store
{ #	проверка заполнения	буфера
if ($buffer[$tail]{$next} != $head) { #в буфере есть место
	$buffer[$tail]{$data} = shift;
	$tail = $buffer[$tail]{$next};
	return 1;
} else {	#	буфер переполнен
	return 0;
	}
};

sub retrieve
{			# проверка заполнения буфера
if ($head != $tail) {	# в буфере есть данные
	$data = $buffer[$head]{$data};
	$head = $buffer[$head]{$next};
	return $data;
} else {			# буфер пуст
	return undef;
	}
}

#-------------------
store 0;
store 1;
store 2;
store 3; 	# буфер заполнен, данное не сохранено
print retrieve, "\n";
print retrieve, "\n";
print retrieve, "\n";

