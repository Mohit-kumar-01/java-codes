import java.util.Scanner;
public class matrix_oddEven_sum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j,k;
        System.out.println("enter no of rows : ");
        r=sc.nextInt();
        System.out.println("enter the no of columns:");
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the elements in array :");
        for (i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the array is : ");
        for (i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        int sum[][]=new int[r][2];
        System.out.println("sum of odd or even in rows is :\neven,odd");
        for (i=0;i<r;i++)
        {
            int sumeven=0,sumodd=0;
            for(j=0;j<c;j++)
            {
                if (arr[i][j]%2==0)
                {
                    sumeven+=arr[i][j];
                }
                else
                {
                    sumodd+=arr[i][j];
                }
            }
            for (k=0;k<2;k++)
            {
                if (k==0)
                {
                    sum[i][k]+=sumeven;
                }
                else
                {
                    sum[i][k]+=sumodd;
                }
            }
        }
        for (i=0;i<r;i++)
        {
            for (j=0;j<2;j++)
            {
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
