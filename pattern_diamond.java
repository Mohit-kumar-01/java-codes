import java.util.Scanner;
public class pattern_diamond
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a no : ");
        int n=sc.nextInt();
        int i,j;
        for (i=0;i<n;i++)
        {
            for (j=n;j>i;j--)
            {
                System.out.print("  ");
            }
            for (j=1;j<=2*i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (i=n;i>0;i++)
        {

        }
    }
}
