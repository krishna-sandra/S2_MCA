read -p "enter:" num
i=2

if [ $num -lt 2 ]
then echo "number is small"
exit 0 
fi
for((i=2;i<num/2;i++))
do
if [ $((num%i)) -eq 0 ]
 then  
 echo " not prime:"
else
echo " prime"
fi
done

 
