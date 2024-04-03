import java.util.*;
class word
{
    Scanner sc=new Scanner(System.in);
    String s;
    word()
    {
        System.out.println("Enter a string:");
        s=sc.nextLine();
    }
    void str_functions()
    {
        System.out.println("Lower case: "+s.toLowerCase());
        System.out.println("\nUpper Case: "+s.toUpperCase());
        System.out.println("\nLength of the string is :"+s.length());
        System.out.println("\nsubstring(2): "+s.substring(2));
        System.out.println("\nsubstring(2,6): "+s.substring(2,6));
        System.out.println("\ntrim "+s.trim());
        System.out.println("\nindexOf('o') : "+s.indexOf('o'));
        System.out.println("\nindexOf('o',10) : "+s.indexOf('o',10));
        System.out.println("\nconcat('CR7') : "+s.concat("CR7"));
    }
}

class string_manipulation 
{
    public static void main(String[] args) 
    {
        word w=new word();
        w.str_functions();

    }
}
