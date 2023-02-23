import java.util.Scanner;

public class reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,mod,rev=0,temp;
        System.out.println("Enter a no.");
        n=sc.nextInt();
        temp=n;
        while (temp!=0)
        {
            mod=temp%10;
            rev=(rev*10)+mod;
            temp=temp/10;
        }
        System.out.println("reverse is : "+rev);
    }
}
