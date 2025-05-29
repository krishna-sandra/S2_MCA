#!/bin/bash
while true
do
read -p "enter numbers:" a b
read -p "enter operator:" op
case $op in
"+")
   ans=$((a+b))
   echo "sum:"$ans;;
"-")
ans=$((a-b))
   echo "sub:"$ans;;
"*")
ans=$((a*b))
   echo "mul:"$ans;;
"/")
ans=$((a/b))
   echo "div:"$ans;;
*)
exit;;
esac
done