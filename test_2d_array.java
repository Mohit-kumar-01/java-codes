public class test_2d_array
{
    public static void main(String[] args) {
        int a1[][]={{7,4,1,},{2,5,8},{6,9,3}};
        int a2[][]={{1,2,3},{1,1,2,},{6,9,4}};
        int[][] arr=new int[3][3];
        int i,j;
        System.out.println("the array 1  is :               the array 2 is : " );
        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                System.out.print(a1[i][j]+"  ");

            }
            System.out.print("\t\t\t\t\t\t\t");
            for (j=0;j<3;j++)
            {
                System.out.print(a2[i][j]+"  ");

            }
            System.out.println("");
        }


        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                arr[i][j]=a1[i][j]*a2[i][j];

            }

        }


//        for(j=0;j<3;j++)
//        {
//            arr[j]=a1[0][j];
//        }
//        for(j=0;j<3;j++)
//        {
//            arr[j]=arr[j]*a1[1][j];
//        }

        System.out.println("\nArray 1 X Array 2 is :");
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
