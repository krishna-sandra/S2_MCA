read -p "enter number:" num
n=$num
rev=0
while [ $num -gt 0 ]
do
 rem=$((num%10))
 rev=$((rem*rem*rem+rev))
 num=$((num/10))
done
if [ $rev -eq $n ]
then
echo "armstong"
else
echo "not armstrong"
fi
