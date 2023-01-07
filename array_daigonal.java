public class array_daigonal
{
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("the given matrix is : ");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println("");
        }

        int sum=0;
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                if(i==j||(i+j)==2)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("sum of diagonals is : "+(sum+arr[1][1]));

    }
}
