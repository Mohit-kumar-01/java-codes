import java.util.Scanner;
public class Bank
{
    public static void main(String[] args)
    {
         int ac1,ac2;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter your pin");
         ac1=sc.nextInt();
        System.out.println("re-enter the pin");
        ac2=sc.nextInt();
        if(ac1==ac2)
        {
            System.out.println("choose your account type");
            System.out.println("press 1 for SAVINGS");
            System.out.println("press 2 for CURRENT");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("enter the amount");
                    int am = sc.nextInt();
                    int i, t;
                    i = am * 5 / 100;
                    t=am+i;
                    System.out.println("5 % intrest of amount is = " + i);
                    System.out.println("total ammount = "+ t);
                    break;
                case 2:
                    System.out.println("enter the amount");
                    int am1 = sc.nextInt();
                    int i1, t1;
                    i1 = am1 * 6 / 100;
                    t1=am1+i1;
                    System.out.println("6 % intrest of amount is = " + i1);
                    System.out.println("total ammount = "+ t1);
                    break;
                default:
                    System.out.println("invalid option");

            }
        }
        else
        {
            System.out.println("invalid pin");
        }

    }
}
