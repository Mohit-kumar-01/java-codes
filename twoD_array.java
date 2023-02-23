import java.util.Scanner;
public class twoD_array
{
    public static void main(String[] args) {
        int arr[][]=new int[3][3],i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elemenets in array of 3x3 : ");
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

    }
}
