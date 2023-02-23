import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0,temp=0,mod;
        System.out.println("enter a no : ");
        n=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            mod=temp%10;
            rev=rev*10+mod;
            temp=temp/10;

        }
        if (rev==n)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }

    }
}
