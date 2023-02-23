import java.util.Scanner;
public class V_pattern
{
    public static void main(String[] args) {
        int n, i, j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (j = n-1; j>= i; j--) {
                System.out.print(" ");
            }

            for (j = n-1; j >= i; j--) {
                System.out.print(" ");
            }

            for (j = i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

}
