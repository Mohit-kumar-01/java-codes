import java.util.Scanner;
public class Class_test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] n=new int[5];
        System.out.println("enter five 4-digit number in array ");
        for (int i=0;i<5;i++)
        {
            n[i]=sc.nextInt();
        }
        System.out.println("\nreverse all elements");
        int temp,m,r;
        int[] rev=new int[5];
        for (int i=0;i<5;i++)
        {
            temp=n[i];
            m=0;r=0;
            while (temp!=0)
            {
                m=temp%10;
                r=(r*10)+m;
                temp=temp/10;
            }
            rev[i]=r;
            System.out.println(rev[i]);
        }
        System.out.println("biggest element is :");
        int max = 0;
        /*for(int i=0;i<4;i++)
        {
            if(rev[i]>rev[i+1])
            {
                max=rev[i];
            }
            else
            {
                max=rev[i+1];
            }
        }
        // 1010   2010  1111*/
        for(int i=0;i<5;i++)
        {
            if(max<rev[i])
            {
                max=rev[i];
            }
        }
        System.out.println(max);
        if(max%2==0)
        {
            System.out.println("it is even number");
        }
        else
        {
            System.out.println("it is odd number");
        }
    }
}
