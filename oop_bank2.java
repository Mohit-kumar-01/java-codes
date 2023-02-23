import java.util.Scanner;
public class oop_bank2
{
    Scanner sc=new Scanner(System.in);
    Scanner s1=new Scanner(System.in);
    int bal=0,acc_no,amount;
    String name,trans,acc_type;
    void get()
    {

        System.out.println("enter account no :");
        acc_no=s1.nextInt();
        System.out.println("enter your name");
        name=sc.nextLine();
        System.out.println("enter account type (saving/current) ");
        acc_type=sc.nextLine();
        System.out.println("deposit or withdraw :");
        trans=sc.nextLine();
    }

    void bank()
    {
        if(trans.charAt(0)=='d')
        {
            System.out.println("enter the amount to deposit");
            amount=sc.nextInt();
            bal+=amount;
        }
        else if(trans.charAt(0)=='w')
        {
            System.out.println("enter the amount to withdraw");
            amount=sc.nextInt();
            bal-=amount;
        }
        else
        {
            System.out.println("error!!!");
        }
        System.out.println("your current balance is : "+bal);
    }

    public static void main(String[] args)
    {
        oop_bank2 b1= new oop_bank2();
        b1.get();
        b1.bank();
    }
}
