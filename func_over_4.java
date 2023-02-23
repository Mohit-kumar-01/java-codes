import java.util.Scanner;
public class func_over_4
{
    static Scanner sc=new Scanner(System.in);
    void show()
    {
        System.out.println("enter first no");
        int a=sc.nextInt();
        System.out.println("enter second no");
        int b=sc.nextInt();
        System.out.println("sum is : "+(a+b));
    }
    void show(int x)
    {
        if(x%2==0)
        {
            System.out.println(x+" is even");
        }
        else
            System.out.println(x+" is odd");
    }
    void show(int x,int y)
    {
        if(x>y)
        {
            System.out.println(x+" is greater than "+y);
        }
        else if(x<y)
        {
            System.out.println(x + " is less than "+y);
        }
        else
        {
            System.out.println(x+" is equal to "+y);
        }
    }

    public static void main(String[] args) {
        func_over_4 f1=new func_over_4();
        f1.show();
        System.out.println("\nenter a no ");
        int n=sc.nextInt();
        f1.show(n);
        System.out.println("\nenter two no. a & b");
        n=sc.nextInt();
        int n1=sc.nextInt();
        f1.show(n,n1);
    }

}
