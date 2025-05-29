read -p "enter a number:" n
if [ $n -eq 0 ]
then 
echo " number is zero"
elif [ `expr $n % 2` -eq 0  ]
then 
echo " even"
else
echo "odd"
fi