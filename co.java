import java.util.Scanner;
public class co
{
    co()
    {
        System.out.println("hello ");
    }
    co(int x)
    {
        if(x%2==0)
        {
            System.out.println(x+" is even");
        }
        else
            System.out.println(x+" is odd");
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        new co();
        System.out.println("enter a no ");
        int n=sc.nextInt();
        new co(n);
    }
}
