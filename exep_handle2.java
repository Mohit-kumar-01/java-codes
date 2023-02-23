import java.util.Scanner;
public class exep_handle2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int flag=0;
        try
        {
            if(n1<0)
            {
                System.out.println(n1+n2);
            }
            else
            {
                flag=1;
            }
        }
        catch (Exception e)
        {
            if(flag==1)
            {
                System.out.println("negative number not allowed");

            }
        }
    }
}
