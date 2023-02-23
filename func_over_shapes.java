import java.util.Scanner;
public class func_over_shapes
{
    int area(int a)
    {
        return a*a;
    }
    int area(int a,int b)
    {
        return a*b;
    }
    double area (double a)
    {
        return 3.14*a*a;
    }

    public static void main(String[] args) {
        func_over_shapes s1=new func_over_shapes();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter side of square:");
        int x=sc.nextInt();
        System.out.println("area of square is : "+s1.area(x));
        System.out.println("enter sides of rectangle:");
        x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("area of rectangle is : "+s1.area(x,y));
        System.out.println("enter the radius of circle");
        x=sc.nextInt();
        System.out.println("area of circle is : "+ s1.area(x));
    }
}
