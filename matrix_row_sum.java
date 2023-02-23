import java.util.Scanner;
public class matrix_row_sum
{
    public static void main(String[] args) {
        int arr[][]=new int[3][3],i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements in array of 3x3 : ");
        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the array is : ");
        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+"  ");

            }
            System.out.println("");
        }
        for (i=0;i<3;i++)
        {
            int sum=0;
            for (j=0;j<3;j++)
            {
                sum+=arr[i][j];
            }
            System.out.println("the sum of row "+i+" is : "+sum);
        }

    }
}
