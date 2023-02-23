import java.util.Scanner;
class menu_driven
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        char ch;
        int n,i;

        do {
            System.out.println("Enter a number");
            n=sc.nextInt();
            System.out.println("\n1. reverse");
            System.out.println("2. check odd or even");
            System.out.println("3. double it");
            System.out.println("4. square it");
            System.out.println("Enter your choice");
            i=sc.nextInt();
            switch(i)
            {
                case 1:
                    int temp, mod, rev=0;
                    temp=n;
                    while(temp!=0)
                    {
                        mod=temp%10;
                        rev=rev*10+mod;
                        temp=temp/10;
                    }
                    System.out.println("reverse is : "+rev);
                    break;
                case 2:
                    if(n%2==0)
                    {
                        System.out.println("it is even");

                    }
                    else
                    {
                        System.out.println("it is odd");
                    }
                    break;
                case 3:
                    System.out.println("double is : "+n*2);
                    break;

                case 4:
                    System.out.println("Square is : "+n*n);
                    break;
                default:
                    System.out.println("invalid choice");
            }
            System.out.println("do you want to continue?  (y/n) ");
            ch=sc.next().charAt(0);

        }while (ch=='y');
    }
}
