public class matrix_sorting
{
    public static void main(String[] args) {
        int arr[][]= {{1,5,7},{0,5,8},{3,2,9}},i,j;
        System.out.println("the given array is : ");
        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println("");
        }
        int temp=0;
System.out.println(" ");

        System.out.println(" ");
            for (i = 0; i <3; i++)
            {
                for (j = 0; j < 3; j++)
                {
                    if (arr[i][j]>arr[i][j+1]){
                        temp=arr[i][j];
                        arr[i][j+1]=arr[i][j];
                        arr[i][j]=temp;

                    }
                }
                System.out.println(" ");
            }


            System.out.println("sorted array is : ");
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
