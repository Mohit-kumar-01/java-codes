import java.util.Scanner;
public class numToArray
{
    public static void main(String[] args)
    {
        int n,temp,size=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        n=sc.nextInt();
        temp=n;


        while (temp != 0)
        {
            temp=temp/10;
            size++;
        }

        int[] arr=new int[size];
        int i=0;
        while (n!=0)
        {
            arr[i]=n%10;
            n=n/10;
            i++;
        }

        


        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+",");
        }

    }
}
