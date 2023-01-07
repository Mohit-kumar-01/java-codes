//      enter a no :
//        9
//        135791
//        357913
//        579135
//        791357
//        913579


import java.util.Scanner;
public class pattern_4
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a no : ");
        int n=sc.nextInt(),i,j;
        for (i=0;i<=n;i++)
        {
            if(i%2!=0)
            {
                for (j=i;j<=n;j++)
                {
                    if (j%2!=0)
                    {
                        System.out.print(j);
                    }
                }
                for (j=1;j<=i;j++)
                {
                    if(j%2!=0)
                    {
                        System.out.print(j);
                    }
                }
                System.out.println();
            }


        }

    }
}
