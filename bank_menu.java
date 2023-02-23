import java.util.Scanner;
import java.lang.*;
public class bank_menu
{
    static Scanner sc=new Scanner(System.in);
    int ac_no, bal=3000, am, fine=0;
    String name;
    void get()
    {
        System.out.println("enter name : ");
        name = sc.nextLine();
        System.out.println("enter account no : ");
        ac_no=sc.nextInt();
    }
    void display()
    {
        System.out.println("name : "+name);
        System.out.println("account number is : "+ac_no );
        if(fine!=0)
        {
            System.out.println("you had a penalty of Rs "+fine);
        }
    }
    void deposit()
    {
        System.out.println("enter the amount to deposit");
        am=sc.nextInt();
        bal+=am;
        System.out.println("transaction successful...");
    }
    void withdraw()
    {
        System.out.println("enter the amount to withdraw");
        am=sc.nextInt();
        if(bal<am)
        {
            System.out.println("! insufficient balance");
        }
        else if ((bal-am)<=3000)
        {
            System.out.println("you are crossing the minimum balance limit...\nAre you sure you want to proceed ? (y/n) ");
            char minbal= sc.next().charAt(0);
            if(minbal=='y'||minbal=='Y')
            {
                bal-=am;
                System.out.println("transaction successful...you had a penalty");
                fine =100;

            }

        }
        else
        {
            bal-=am;
            System.out.println("transaction successful");
            fine=0;
        }

    }
    void mini()
    {
        System.out.println("*Mini statement*");
        System.out.println("Name : "+name);
        System.out.println("Account no. : "+ac_no);
        System.out.println("Current balance : Rs "+bal);
        if (fine!=0)
        {
            System.out.println("you had penalty of Rs "+fine+"... because you had violated minimum balance criteria ");

        }
    }

    public static void main(String[] args) {
        bank_menu b1 = new bank_menu();
        Scanner s1=new Scanner(System.in);
        char ch = 'y';
        do {
            System.out.println("Welcome to xyz bank");
            System.out.println("1. create an account");
            System.out.println("2. already had an account");
            int log = s1.nextInt();
            if (log == 1)
            {
                String n,dob;
                System.out.println("enter your details.");
                System.out.println("enter name");
                n = sc.nextLine();
                System.out.println("enter DOB.");
                dob = sc.nextLine();
                System.out.println("create your pin ");
                int pin = sc.nextInt();
                System.out.println("account created successfully\n");
            } else {
                b1.get();
                do {
                    System.out.println("1. Display details ");
                    System.out.println("2. deposit amount");
                    System.out.println("3. withdraw amount");
                    System.out.println("4. mini statements ");
                    System.out.println("5. exit");
                    System.out.println("enter your choice...");
                    int x = sc.nextInt();
                    switch (x) {
                        case 1:
                            b1.display();
                            break;
                        case 2:
                            b1.deposit();
                            break;
                        case 3:
                            b1.withdraw();
                            break;
                        case 4:
                            b1.mini();
                            break;
                        case 5:
                            System.out.println("thank you");
                            System.exit(0);
                        default:
                            System.out.println("error !!!....\n");

                    }
                    System.out.println("Do you want to continue(y/n).");
                    ch = sc.next().charAt(0);


                } while (ch == 'y' || ch == 'Y');
            }
        }while(true);
    }

}