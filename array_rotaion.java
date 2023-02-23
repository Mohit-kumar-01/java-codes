import java.util.Scanner;
public class array_rotaion
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc=new Scanner(System.in);

        int arr[]= {1,2,3,4,5,6};
        System.out.println("given array : ");
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        int first=arr[1];
        System.out.println("after rotaion :");
        for(i=0;i<arr.length;i++);
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;

        for(i=0;i<arr.length;i++);
        {
            System.out.println(arr[i]);
        }


    }
}
