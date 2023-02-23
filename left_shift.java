import java.util.Scanner;
public class left_shift
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={2,5,7,6,1,9},i,j,temp;

        System.out.println("the given array is : ");
        for (i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        int last=a[0];

        for (i=0;i<5;i++)
        {
            a[i]=a[i+1];
        }
        a[5]=last;
        System.out.println("\nthe new array is :");
        for (i=0;i<=5;i++)
        {
            System.out.println(a[i]);
        }

    }
}