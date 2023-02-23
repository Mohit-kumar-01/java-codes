import java.util.Scanner;
public class array_inserting
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[],n,i,j;
        a=new int[5];
        System.out.println("enter elements in array");
        for (i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter a new element to be insert");
        n=sc.nextInt();
        System.out.println("enter the index where you want to insert");
        j=sc.nextInt();
        for (i=0;i<5;i++)
        {
            if (i==j)
            {
                a[i]=n;
            }
        }
        System.out.println("the new array is");
        for (i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
