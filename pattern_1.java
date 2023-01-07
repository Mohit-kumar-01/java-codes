//    pattern is :
//        1
//        121
//        12321
//        1234321
//        123454321
//        1234321
//        12321
//        121
//        1

import java.util.Scanner;
public class pattern_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("enter a no : ");
        n= sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for (j=i-1;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=n-i;j++)
            {
                System.out.print(j);
            }
            for (j=n-i-1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

}
