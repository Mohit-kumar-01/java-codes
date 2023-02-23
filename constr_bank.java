import java.util.Scanner;
public class constr_bank
{

    int ac_no,bal=0,am,fine=0;
    char minbal;
    String name,type;
    constr_bank()
    {
        bal=0;
    }
    constr_bank(String s,int n, int b)
    {
        System.out.println("\nName : "+s);
        System.out.println("Account no is : "+n);
        System.out.println("Current balance : "+b+"/-");
    }

    void new_user()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name : ");
        name=sc.nextLine();
        System.out.println("enter your DOB : ");
        String dob= sc.nextLine();
        System.out.println("enter your mobile no : ");
        int num=sc.nextInt();
        System.out.println("enter the amount of opening balance : ");
        bal=sc.nextInt();
    }
    void get()
    {
        Scanner scg=new Scanner(System.in);
        System.out.println("enter name : ");
        name = scg.nextLine();
        System.out.println("enter account no : ");
        ac_no=scg.nextInt();
    }
    void deposit()
    {
        Scanner scd=new Scanner(System.in);
        System.out.println("enter name of depositor :");
        name=scd.nextLine();
        System.out.println("enter the amount to deposit");
        am=scd.nextInt();
        bal+=am;
        System.out.println("transaction successful...");
    }

    void withdraw()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the amount to withdraw");
        am=s.nextInt();
        if(bal<am)
        {
            System.out.println("! insufficient balance");
        }
        else if ((bal-am)<=3000)
        {
            System.out.println("you are crossing the minimum balance limit...\nAre you sure you want to proceed ? (y/n) ");
            minbal= s.next().charAt(0);
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
    void receipt(int r)
    {
        System.out.println("\n\t\t\t\t* Transaction receipt *");
        System.out.println("name : \t"+name);
        System.out.println("account num. :\t"+ac_no);
        if(r==2)
        {
            System.out.println("amount credited :\t"+am);
        }
        else if (r==3)
        {
            System.out.println("amount debited :\t"+am);
        }
        System.out.println("current balance : " +bal);
    }

    public static void main(String[] args) {
        Scanner sm=new Scanner(System.in);
        constr_bank b1=new constr_bank();
        System.out.println("\t\t\t\t * WELCOME TO SBI BANK *");
        char ch='y';
        do {
            System.out.println("1. create an account");
            System.out.println("2. already had an account");
            System.out.println("enter your choice : ");
            int log = sm.nextInt();
            if(log==1)
            {
                b1.new_user();
                System.out.println(" Account created successfully \nThank you \n");
            }
            else
            {
                b1.get();
                do{
                    System.out.println("1. Display details");
                    System.out.println("2. deposit amount");
                    System.out.println("3. withdraw amount");
                    System.out.println("4. mini statements ");
                    System.out.println("5. exit");
                    System.out.println("enter your choice...");
                    int x= sm.nextInt();
                    switch(x)
                    {
                        case 1:
                           new constr_bank(b1.name,b1.ac_no,b1.bal);
                           break;
                        case 2:
                            b1.deposit();
                            System.out.println("do you want to print receipt ?(y/n");
                            char rec=sm.next().charAt(0);
                            b1.receipt(x);
                            break;
                        case 3:
                            b1.withdraw();
                            System.out.println("do you want to print receipt ?(y/n");
                            rec=sm.next().charAt(0);
                            b1.receipt(x);
                            break;
                        case 4:
                            b1.mini();
                            break;
                        case 5:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("!!! Error (invalid choice) !!!");
                            break;
                    }
                    System.out.println("Do you want to continue(y/n).");
                    ch = sm.next().charAt(0);
                }while(ch=='y'||ch=='Y');
            }
        }while(true);
    }
}
