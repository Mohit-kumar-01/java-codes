import java.util.Scanner;
class user
{
    Scanner sc=new Scanner(System.in);
    String name;
    int acc_no,bal=0;
    public void get()
    {
        System.out.println("enter name :");
        name=sc.nextLine();
        System.out.println("enter acc no");
        acc_no=sc.nextInt();
        System.out.println("enter current balance");
        bal=sc.nextInt();
    }

}

class bank extends user
{
    Scanner sc=new Scanner(System.in);
    int am,t;
    public void txn()
    {
        System.out.println("what do you want : ");
        System.out.println("1. deposit\n2. withdraw ");
        t=sc.nextInt();
        System.out.println("enter the amount");
        am=sc.nextInt();
        if(t==1)
        {
            bal+=am;
        }
        else if(t==2)
        {
            bal-=am;
        }
        System.out.println("txn successful....");
    }
}
class details extends bank
{
    public void display()
    {
        System.out.println("name : "+name);
        System.out.println("account no : " +acc_no);
        System.out.println("current balance : "+bal);

    }
}
public class test extends details
{
    public static void main(String[] args)
    {
        test t1=new test();
        t1.get();
        t1.txn();
        t1.display();
    }
}
