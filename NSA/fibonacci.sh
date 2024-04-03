a=0
b=1

read -p 'Enter a number:' n
echo $a $b

for i in $(seq $n)
do 
	temp=$(($a+$b))
	echo $temp
	a=$b
	b=$temp
done

