//        enter a no :
//        5
//        * * * * *
//         * * * * *
//          * * * * *
//           * * * * *
//            * * * * *


import java.util.Scanner;
public class pattern_2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("enter a no : ");
        n=sc.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for (j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
