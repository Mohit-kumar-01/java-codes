//        enter a no :
//        5
//        1=1
//        1+2=4
//        1+2+3=10
//        1+2+3+4=20
//        1+2+3+4+5=35


import java.util.Scanner;
public class pattern_3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j,sum=0;
        System.out.println("enter a no : ");
        n= sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                sum+=j;
                System.out.print(j);
                if(j<i)
                {
                    System.out.print("+");
                }
            }
            System.out.println("="+sum);

        }

    }
}
