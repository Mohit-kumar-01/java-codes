//      enter a no.
//        5
//                1
//              2 3 2
//            3 4 5 4 3
//          4 5 6 7 6 5 4
//        5 6 7 8 9 8 7 6 5


import java.util.Scanner;
public class pattern_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a no. ");
        int n=sc.nextInt(),i,j;
        for (i=1;i<=n;i++)
        {
            for (j=n;j>i;j--)
            {
                System.out.print("  ");
            }
            for (j=i;j<=2*i-1;j++)
            {
                System.out.print(j+" ");
            }
            for (j=2*i-2;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
