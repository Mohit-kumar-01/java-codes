import java.util.Scanner;
public class func_over2
{

    void ac_no(int a)
    {
        System.out.println("accoun no is : "+a);
    }
    void ac_no(int a, int b)
    {
        if (a==b)
        {
            System.out.println("account number matched successfully");
        }
        else
        {
            System.out.println("!!!account number not matches!!!");
        }
    }

    public static void main(String[] args)
    {
        func_over2 f1=new func_over2();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your account no. : ");
        int a1=sc.nextInt();
        f1.ac_no(a1);
        System.out.println("re-enter account no. :");
        int a2=sc.nextInt();
        f1.ac_no(a1,a2);
    }
}
