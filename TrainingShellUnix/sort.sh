#!/bin/bash

exchange ()
{
	local temp=${Cnt[$1]}
	Cnt[$1]=${Cnt[$2]}
	Cnt[$2]=$temp
	return
}

declare -a Cnt
Cnt=(34 56 78 35 83 92 73 84 82 37 59 27 50)

clear
echo "0: ${Cnt[*]}"
num_of_elements=${#Cnt[@]}
echo $num_of_elements
let "comparsions = $num_of_elements - 1"
count=1
while [ "$comparsions" -gt 0 ]
do
	i=0
	while [ "$i" -lt "$comparsions" ]
	do
		if [ ${Cnt[$i]} -lt ${Cnt[`expr $i + 1`]} ]
		then
			exchange $i `expr $i + 1`
		fi
		let "i+=1"
	done
let "comparsions -= 1"
echo
echo "$count: ${Cnt[@]}"
echo
let "count +=1 "
done
exit 0
