import java.util.Scanner;

public class array_demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 elements in array");

        int[] num =new int[5];
        for(int i=0;i<5;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("enter target value:");
        int target=sc.nextInt();
        for(int i = 0;i<5-1;i++)
        {
            for(int j=i+1;j<5;j++)
            {
//                if((i+j)==target)
//                {
                    System.out.println("["+i+","+j+"]");
//                }
            }
        }
    }
}
