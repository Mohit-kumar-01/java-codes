import java.util.Scanner;
public class sum_while
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=1,sum=0,a;
        while (i<=5)
        {
            System.out.println("enter the no.");
            a=sc.nextInt();
            sum=a+sum;
            i++;
        }
        System.out.println("sum is : "+sum);
    }
}
