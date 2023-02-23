import java.util.Scanner;

public class linear_search
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the size of array ");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in array :");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x;
        System.out.println("enter the element to be searched : ");
        x=sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                System.out.println("element found at position "+(i+1));
            }
        }
    }
}
