import java.util.Scanner;
public class count_digit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        System.out.println("enter a no");
        n=sc.nextInt();
        while(n!=0)
        {
            n=n/10;
            count++;

        }
        if (count>=6)
        {
            System.out.println("no of digits >= 6");

        }
        else
        {
            System.out.println("no of digits < 6");
        }
    }
}
