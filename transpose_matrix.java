public class transpose_matrix
{

    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int i,j;
        System.out.println("the given array is : ");
        for (i=0;i<3;i++)
        {
            System.out.print("|");
            for (j=0;j<3;j++)
            {
                System.out.print("  "+arr[i][j]+"  ");
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.println("\nAfter transpose : ");
        for (i=0;i<3;i++)
        {
            System.out.print("|");
            for (j=0;j<3;j++)
            {
                System.out.print("  "+arr[j][i]+"  ");
            }
            System.out.print("|");
            System.out.println("");
        }
    }
}
