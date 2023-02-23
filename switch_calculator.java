import java.util.Scanner;

public class switch_calculator
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
        a=sc.nextInt();
        System.out.println("enter value of b");
        b=sc.nextInt();
        System.out.println("\n1. sum");
        System.out.println("2. subtract");
        System.out.println("3. multiply");
        System.out.println("4. divide 'a/b' ");
        System.out.println("Enter your choice : ");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid option");
        }
    }
}
