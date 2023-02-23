import java.util.Scanner;
public class class_test2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a 4 digit no");
        int n=sc.nextInt();
        int[] arr=new int [4];
        int temp1=n,m=0,count=3;
        while (temp1!=0)
        {
            m=temp1%10;
            arr[count]=m;
            temp1=temp1/10;
            count--;
        }

        System.out.println("after swapping first and last digit...");
        int temp2=0;
        temp2=arr[0];
        arr[0]=arr[3];
        arr[3]=temp2;
        for (int i=0;i<4;i++)
        {
            System.out.print(arr[i]);
        }
    }
}