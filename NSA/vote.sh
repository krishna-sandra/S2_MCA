read -p 'enter your age:' age
echo $age
if [ $age -le 18 ]
then 
   echo " not eligible for voting"

else 

  echo "eligible for voting"

fi
