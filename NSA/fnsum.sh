# 	sum()
# 	{
# 	read -p 'enter value for a:' a
#	read -p 'enter value for b:' b
#	c=$(($a+$b))
#	echo $c
#	}
#	sum


sum()
{ 
 c=$(($1+$2))
 echo "$c"
}
sum 10 30

