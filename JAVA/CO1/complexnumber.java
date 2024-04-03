public class complexnumber {
    int real,image;
    public complexnumber(int r,int i)
    {
        this.real=r;
        this.image=i;
    }
    public void showc()
    {
        System.out.print(this.real + "+i" + this.image);
    }
    public static complexnumber add(complexnumber n1,complexnumber n2)
    {
        complexnumber res= new complexnumber(0,0);
        res.real= n1.real+n2.real;
        res.image= n1.image+n2.image;
        return res;

    }
    public static void main(String[] args)
    {
       complexnumber c1 = new complexnumber(4,5);
       complexnumber c2 = new complexnumber(10,5);

       System.out.print("First complex number:");
       c1.showc();

       System.out.print("\nSecond complex number:");
       c2.showc();

       complexnumber res = add(c1,c2);
       System.out.println("\nAddition is:");
       res.showc();
    }
}

