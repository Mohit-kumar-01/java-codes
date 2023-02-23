import java.util.Scanner;
public class hill
{
    public static void main(String[] args) {
        int n,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no : ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for (j=n;j>i;j--)
            {
                System.out.print("  ");
            }
            for (k=0;k<i;k++)
            {
                System.out.print("* ");
            }
            for (j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
