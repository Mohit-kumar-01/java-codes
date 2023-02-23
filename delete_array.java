import java.util.Scanner;
public class delete_array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={2,5,7,6,1,9},i,j,temp;
        System.out.println("the given array is : ");
        for (i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("enter the index of element you want to delete");
        j=sc.nextInt();
        for (i=j;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        System.out.println("\nthe new array is :");
        for (i=0;i<a.length-1;i++)
        {
            System.out.println(a[i]);
        }

    }
}
