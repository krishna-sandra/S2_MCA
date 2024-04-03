public class fibonacci
{
    public static void main(String[] args)
    {
        int n=5 ;
        int a=0,b=1;
    
        System.out.println("fibonacci series:");
        System.out.println(a+" "+b+ "");
        for(int i=2;i<n;i++)
        {
            int c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
    }
}
