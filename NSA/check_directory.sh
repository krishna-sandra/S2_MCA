read -p " enter directory:" dir
for filename in "C:\Users\HP\Desktop\S2_MCA/$dir"
do
if [ -d "$filename" ]
then
echo "directory"
else
echo "not a directory"
fi
done