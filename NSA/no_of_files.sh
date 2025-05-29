#!/bin/bash
read -p "enter directory:" dir
direct="C:\Users\HP\Desktop\S2_MCA/$dir"
if [ -d $direct ]
then
count_file=$(find "$direct" -type f | ls -l $direct | wc -l )
echo $count_file
else
echo "not a directory"
fi