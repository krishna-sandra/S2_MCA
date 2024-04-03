for i in $(seq 5)
do 
 if [ $i -eq  4 ]
   then 
     continue
 fi
 echo $i
done
