import java.util.Scanner;
public class oop_bank
{
    Scanner sc=new Scanner(System.in);
    int bal = 0,ac,am;
    String name,t,trans;
    void get()
    {
        System.out.println("enter your name : ");
        name = sc.nextLine();
        System.out.println("enter your account no. :");
        ac = sc.nextInt();

    }
    void get1()
    {
        System.out.println("enter your account type (saving/current) :");
        t = sc.next();

    }
    void get2()
    {
        System.out.println("type deposit or withdraw");
        trans=sc.nextLine();
    }
    void bank()
    {

        if(trans.equals("deposit"))
        {
            System.out.println("enter the amount to deposit");
            am=sc.nextInt();
            bal+=am;
        }
        else if(trans.equals("withdraw"))
        {
            System.out.println("enter the amount to withdraw");
            am=sc.nextInt();
            bal-=am;
        }
        System.out.println("your current balance is : "+bal);
    }

    public static void main(String[] args) {
        oop_bank b1=new oop_bank();
        b1.get();
        b1.get1();
        b1.get2();
        b1.bank();
    }
}
