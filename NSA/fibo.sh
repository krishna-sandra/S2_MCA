read -p "enter number:" num
a=0
b=1
echo $a
echo $b
for i in $(seq $num)
do 
  
  c=$(($a+$b))
  
  echo $c
  a=$b
  b=$c
done