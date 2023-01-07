import java.util.Scanner;
public class recursion_sum
{
    public static int sum(int x)
    {
        if(x>0)
        {
            return x+sum(x-1);
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n=sc.nextInt();
        System.out.println("sum of "+n+" digits are : "+sum(n));

    }
}
