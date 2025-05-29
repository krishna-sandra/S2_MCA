a=1
for i in $(seq 10)
do
if [ $i -eq 5 ]
then
continue
fi
echo $i
done
