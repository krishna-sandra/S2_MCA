read -p 'enter value for num:' num
fact=1
for i in $(seq $num)
do
	fact=$(($fact*$i))
	
done
echo $fact

