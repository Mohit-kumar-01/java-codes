import java.util.Scanner;

public class arrays
{
    public static void main(String[] args)
    {
       int [] arr = new int[6];
       Scanner sc=new Scanner(System.in);

       System.out.println("enter values in array");
       for(int i=0;i<=5;i++)
       {
           arr[i]=sc.nextInt();
       }

        System.out.println("the array is : ");
        for(int i=0;i<=5;i++)
        {
            System.out.print(arr[i] +",");


        }
        System.out.println("");

        int  n,less=0,more=0,eq=0;
        System.out.println("enter a no. to be compared");
        n= sc.nextInt();
        for(int i=0;i<=5;i++)
        {
            if(arr[i]==n)
                eq++;
            else if(arr[i]<n)
                less++;
            else if(arr[i]>n)
                more++;

        }

        System.out.println("number of smaller values = " + less);
        System.out.println("number of greater values = " + more);
        System.out.println("number of equal values = " + eq);

    }
}
