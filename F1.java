
import java.util.Scanner;

public class F1
{
    public int sq(int a)
    {
        a=a*a;
        return a;
    }
    public static void main(String arg[])
    {
        int x, s;
        F1 obj=new F1();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        x=sc.nextInt();
        s=obj.sq(x);
        System.out.println("the square is :"+s);

    }
}
