import java.util.Scanner;

public class DivisibleBy_2and3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n,c2=0,c3=0,m;
        System.out.println("enter a no :");
        n=sc.nextInt();
        while (n>0)
        {
            m=n%10;
            if(m%2==0)
            {
                c2++;
            }
            else if(m%3==0)
            {
                c3++;
            }
            n=n/10;
        }
        System.out.println("no of digits divisible by 2 = "+c2);
        System.out.println("no of digit divisible by 3 = "+c3);

    }
}
