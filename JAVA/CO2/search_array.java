import java.util.*;
class array
{
    Scanner sc=new Scanner(System.in);
    int arr[],size;
    array(int n)
    {
        size=n;
        arr=new int[n];
        System.out.println("Enter  the elements to the array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    }
    void search(int n)
    {
        int c=0;
        for(int i=0;i<size;i++)
            if (arr[i]==n)
            {
                c=1;
                System.out.println(n+" is found in the array.");
                break;
            }
        if(c==0)
        System.out.println(n+" is not found in the array.");

    }
    }
    class search_array
    {
        public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number of element you want in your array:");
            int n=sc.nextInt();
            array a=new array(n);
            System.out.println("Enter the number you want to search in the array:");
            int num=sc.nextInt();
            a.search(num);
        }

    }
