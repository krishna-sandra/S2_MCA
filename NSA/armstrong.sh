read -p "Enter a number:" num
n=$num
rev=0

while [ $num -gt 0 ]
do
	rem=$((num % 10))
	rev=$((rev + rem * rem * rem))
	num=$((num / 10))
done
if [ $n -eq $rev ]
then
echo " Armstrong number"
else
echo " Not armstrong number"
fi

