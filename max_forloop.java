import java.util.Scanner;
public class max_forloop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,a,max=0;
        System.out.println("program to find max between 5 numbers \n");
        for(i=0;i<5;i++)
        {
            System.out.println("enter the no...");
            a=sc.nextInt();
            if(a>max)
            {
                max=a;
            }
        }
        System.out.println("max is : "+max);
    }
}
