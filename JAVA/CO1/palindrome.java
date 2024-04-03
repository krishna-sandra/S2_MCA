import java.util.*;

public class palindrome 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int onum=num;
        int rev=0;
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(onum==rev)
        {
            System.out.println(onum+" is a palindrome");
        }
        else
        {
            System.out.println(onum+" is not a palindrome");
        }

    }
}
