import java.util.Scanner;
public class array_sorting
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[],i,j,temp=0;
        a=new int [5];
        System.out.println("enter elements in array");
        for (i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        for (i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("sorted aray is ");
        for (i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

    }
}
