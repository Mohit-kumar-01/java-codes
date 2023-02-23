public class nump1
{
    public static void main(String[] args)
    {
        int i,j,k;
        for (i=0;i<7;i++)
        {
            for (j=7;j>=i;j--)
            {
                System.out.print("  ");
            }
            for (k=1;k<=(2*i-1);k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
