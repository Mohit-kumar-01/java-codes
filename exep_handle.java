import java.util.Scanner;
public class exep_handle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        try
        {
            n1=sc.nextInt();
            n2=5/n1;
            System.out.println(n2);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by 0 ");
        }
        catch(Exception e)
        {
            System.out.println("exception occurred");
        }
        System.out.println("exited try catch block");
    }
}
