public class triangle {
    public static void main(String[] args) {
        int i,j,n=8;
        for (i=0;i<n-1;i++)
        {
            for(int k=n-1;k>i;k--)
            {
                System.out.print(" ");
            }
            for (j=0;j<=i;j++)
            {
                System.out.print("O ");
            }
            System.out.println();
        }
    }
}
