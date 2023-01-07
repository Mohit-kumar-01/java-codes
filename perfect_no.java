import java.util.Scanner;
public class perfect_no
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if (n==sum)
        {
            System.out.println("sum is : "+sum);
            System.out.println("this is a perfect no");

        }
        else
            System.out.println("this is not a perfect no ");
    }
}
