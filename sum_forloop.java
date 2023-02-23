import java.util.Scanner;
public class sum_forloop
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int i,sum=0,a;
            for(i=0;i<5;i++)
            {
                System.out.println("enter a number ");
                a=sc.nextInt();
                sum=a+sum;
            }
        System.out.println("Sum is : "+sum);
    }
}
