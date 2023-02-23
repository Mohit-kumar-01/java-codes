import java.util.Scanner;
public class salary
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary,in;
        for (int i=1;i<=5;i++)
        {
            System.out.println("\nEnter salary for user "+i);
            salary=sc.nextInt();
            if(salary>=15000)
            {
                in=salary*6/100;
                System.out.println("6% interest is : "+in);
                System.out.println("total salray is : "+(salary+in));

            }
            else
            {
                in=salary*4/100;
                System.out.println("4% salray is : "+in);
                System.out.println("total salary is : "+(salary+in));
            }
        }

    }
}
