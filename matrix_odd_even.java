import java.util.Scanner;
public class matrix_odd_even
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j;
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
        System.out.println("Odd Even array is : ");
        for (i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(arr[i][j]%2==0)
                {
                    System.out.print("odd  ");
                }
                else
                {
                    System.out.print("even  ");
                }

            }
            System.out.println("");
        }
    }
}
