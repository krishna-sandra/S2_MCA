read -p "Enter a string: " s
su=$s
l=${#s}
ns=""
for i in $(seq $l -1 1)
do
    a=$(expr substr "$s" $i 1)
    ns="$ns$a"
done
echo "Reversed string: "$ns
if [ $ns = $su ]
then echo " palindrome"
else echo " not palindrome"
fi 