import java.util.*;
class shape_area
{
    void area(double r)
    {
        System.out.println("Area of circle:"+(3.14*r*r));
    }
    void area(float r)
    {
        System.out.println("Area of square:"+(r*r));
    }
    void area(double l,double b)
    {
        System.out.println("Area of rectangle:"+(l*b));
    }
    void area(float b,float h)
    {
        System.out.println("Area of triangle:"+(0.5*b*h));
    }
}
class area_main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        shape_area s =new shape_area();
        System.out.print("Enter radius of circle:");
        s.area(sc.nextDouble());
        System.out.print("Enter the length of a square:");
        s.area(sc.nextFloat());
        System.out.print("Enter the length and breadth of a rectangle:");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        s.area(a,b);
        System.out.print("Enter the height and breadth of a triangle:");
        float a1= sc.nextFloat();
        float b1= sc.nextFloat();
        s.area(a1,b1);
    }
}
