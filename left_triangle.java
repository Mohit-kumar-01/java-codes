import java.util.Scanner;
public class left_triangle
{
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no :");
        n=sc.nextInt();
        for (i=0;i<n;i++)
        {
            for (j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
