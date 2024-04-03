#!bin/bash

a=0
b=1

fib(){
echo $a
echo $b

for i in $(seq $1)
do 
	temp=$(($a+$b))
	echo $temp
	a=$b
	b=$temp
done
}

fib 5
  
   
