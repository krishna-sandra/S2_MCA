public class prime {
    public static void main(String[] args)
    {
        int num=11;
        if(num==1){
            System.out.println("not a prime number");
        }
        else{
            int k=0;
            for(int i=2;i<num/2;i++)
            {
                if(num%i==0)
                {
                    k=1;
                    break;
                }
            }
            if(k==0)
            {
                System.out.println(num+" is a prime number ");
            }
            else
            {
                System.out.println(num+" is not a prime number ");
            }
        }
    }
}
