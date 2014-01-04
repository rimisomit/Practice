#!/bin/bash

arr=(first second third)

echo ${arr[@]}
echo ${arr[*]}
echo ${arr[0]}
echo ${arr[1]}
echo ${#arr[@]}
echo ${!arr[@]}
echo ${#arr}
echo ${arr[@]#t}
echo ${arr[@]%d}
