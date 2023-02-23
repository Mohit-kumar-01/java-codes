import java.util.Scanner;

public class reverse_hill
{
    public static void main(String[] args)
    {
        int n=5;
        Scanner sc=new Scanner(System.in);

        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
