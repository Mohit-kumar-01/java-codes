//      enter a number :
//        5
//                   A
//               99 98 97
//             B  C  D  E  F
//          96 95 94 93 92 91 90
//        G  H  I  J  K  L  M  N  O



import java.util.Scanner;
public class pattern_alphaNumeric
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n=sc.nextInt();
        int i,j;
        char ch='A';
        int x=99;
        for(i=0;i<n;i++)
        {
            for (j=n;j>i;j--)
            {
                System.out.print("   ");
            }
            if(i%2==0)
           {
               for (j=0;j<2*i+1;j++)
               {
                   System.out.print(ch+"  ");
                   ch++;
               }

           }
           else
           {
               for (j=0;j<2*i+1;j++)
               {
                   System.out.print(x+" ");
                   x--;
               }
           }
           System.out.println();
        }


    }
}
