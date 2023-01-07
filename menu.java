import com.sun.javaws.exceptions.ExitException;

import java.util.Scanner;

public class menu
{
    static int rev(int n)
    {
        int temp,r=0,m;
        temp=n;

        while(temp!=0)
        {
            m=temp%10;
            r=r*10+m;
            temp=temp/10;
        }
        return r;
    }

    static void palin(int n)
    {
       /* int temp,r=0,m;
        temp=n;
        while(temp!=0)
        {
            m=temp%10;
            r=r*10+m;
            temp=temp/10;
        } */
        if(rev(n)==n)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }

    static void arm(int n)
    {
        int temp=0,r=0,m=0;
        temp=n;
        while(temp!=0)
        {
            m=temp%10;
            r=r+(m*m*m);
            temp=temp/10;
        }
        if(r==n)
            System.out.println("it is Armstrong");
        else
            System.out.println("not Armstrong");

    }

    static void prime(int n)
    {
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+" is not prime number");
        }
        else
        {
            for(i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(n+" is prime number");
            }
        }
    }

    static int sum(int n)
    {
        int temp,r=0,m;
        temp=n;
        while(temp!=0)
        {
            m=temp%10;
            r=r+m;
            temp=temp/10;
        }
        return r;
    }
    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        num=sc.nextInt();

        int d;
        String ch="y";

        do
        {
            System.out.println("\n1. Reverse");
            System.out.println("2. Check for palindrome");
            System.out.println("3. Check for armstrong");
            System.out.println("4. Check prime");
            System.out.println("5. Sum of digits");
            System.out.println("6. Exit");
            System.out.println("Enter your choice :");
            d=sc.nextInt();

            switch(d)
            {
                case 1:
                    System.out.println(rev(num));
                    break;

                case 2:
                    palin(num);
                    break;

                case 3:
                    arm(num);
                    break;

                case 4:
                    prime(num);
                    break;

                case 5:
                    System.out.println("Sum of digit is : "+sum(num));
                    break;

                case 6:
                    System.out.println("thank you :)");
                    break;

                default:
                    System.out.println("invalid option");
                    break;
            }

            System.out.println("do you want to continue (y/n):");
            ch=sc.nextLine();
        }while(ch=="y"||ch=="Y");
    }
}