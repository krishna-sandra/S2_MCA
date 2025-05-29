read -p 'enter a num:' n
echo " number is $n"
fact=1
for i in $(seq $n)
do
    fact=$(($fact*$i))
done

echo $fact
