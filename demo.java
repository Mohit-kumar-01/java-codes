import java.util.Scanner;
public class demo
{
    String[] name =new String[5];
    String dob[]=new String[5];
//    String add[]=new String[5];
    int acc_no[]=new int[5];
    int m_no[]=new int[5];
    int bal[]=new int[5];
    int fund[]=new int[5];
    int fine=0,am,flag=0,i=0;
    Scanner scint=new Scanner(System.in);
    Scanner sc=new Scanner(System.in);
    void create(int n)
    {
        System.out.println("enter name :");
        name[n]=sc.nextLine();
        System.out.println("enter DOB :");
        dob[n]=sc.nextLine();
        System.out.println("enter mobile no :");
        m_no[n]=scint.nextInt();
        System.out.println("enter opening balance :");
        bal[n]=scint.nextInt();
        System.out.println("enter the allotted Account number :");
        acc_no[n]=scint.nextInt();
        System.out.println("Account created successfully\n");

    }
    int get()
    {
        int a = 0;
        System.out.println("Enter acc no : ");
        int acno =sc.nextInt();
        for(int j=0;j<5;j++)
        {
            if(acc_no[j]==acno)
            {
                System.out.println("name : "+name[j]);
                a=j;
                flag=0;
                break;
            }
            else
            {
                flag=1;
            }
        }

        if(flag==0) {
            return a;
        }
        else
        {
            System.out.println("account not found");
            return 0;
        }
    }

    void display(int i)
    {
        System.out.println("name : " + name[i]);
        System.out.println("account number is : " + acc_no[i]);
        if (fine != 0)
        {
            System.out.println("you had a penalty of Rs " + fine);
        }
        if (fund[i] != 0)
        {
            System.out.println("funds invested in FD : " + fund[i]);
        }
        System.out.println("current balance : "+bal[i]);

    }
    void deposit(int i)
    {
        System.out.println("enter the amount to deposit");
        am=sc.nextInt();
        bal[i]+=am;
        System.out.println("transaction successful...");
    }
    void withdraw(int i)
    {
        System.out.println("enter the amount to withdraw");
        am=sc.nextInt();
        if(bal[i]<am)
        {
            System.out.println("! insufficient balance");
        }
        else if ((bal[i]-am)<=3000)
        {
            System.out.println("you are crossing the minimum balance limit...\nAre you sure you want to proceed ? (y/n) ");
            char minbal= sc.next().charAt(0);
            if(minbal=='y'||minbal=='Y')
            {
                bal[i]-=am;
                fine =100;
                bal[i]-=fine;
                System.out.println("transaction successful...you had a penalty of RS: "+fine );

            }

        }
        else
        {
            bal[i]-=am;
            System.out.println("transaction successful");
            fine=0;
        }

    }
    void receipt(int i,int r)
    {
        System.out.println("\n\t\t\t\t* Transaction receipt *");
        System.out.println("name : \t"+name[i]);
        System.out.println("account num. :\t"+acc_no[i]);
        if(r==2)
        {
            System.out.println("amount credited :\t"+am);
        }
        else if (r==3)
        {
            System.out.println("amount debited :\t"+am);
        }
        System.out.println("current balance : " +bal[i]);
    }
    void fd(int i)
    {
        int yr1,yr2,tp;
        System.out.println("enter opening year of FD");
        yr1=scint.nextInt();
        int byaj=0;
        System.out.println("running year");
        yr2=scint.nextInt();
        tp=yr2-yr1;
        System.out.println("enter the amount you want to add in FD :");
        int f =scint.nextInt();
        if((bal[i]-=fund[i])<3000)
        {
            System.out.println("! cannot add funds. ");
        }
        else
        {

            bal[i]-=f;
            System.out.println("choose tine period of FD ");
            System.out.println("1. one year (interest rate 4% / anum ");
            System.out.println("2. five years (interest rate 10% / anum ");
            int ft=scint.nextInt();
            if(ft==1)
            {
                byaj=(fund[i]/100)*4*tp;
            }
            else if(ft==2)
            {
                byaj=(fund[i]/100)*10*tp;
            }
            System.out.println("funds added successfully");
            fund[i]+=byaj;
        }

    }
    void mini(int i)
    {
        System.out.println("*Mini statement*");
        System.out.println("Name : "+name[i]);
        System.out.println("Account no. : "+acc_no[i]);
        System.out.println("Current balance : Rs "+bal[i]);
        if (fine!=0)
        {
            System.out.println("you had penalty of Rs "+fine+"... because you had violated minimum balance criteria ");

        }
    }
    public static void main(String[] args)
    {
        demo d1 = new demo();
        Scanner s1 = new Scanner(System.in);
        char ch = 'y';
        int k=0;
        do
        {
            System.out.println("Welcome to xyz bank");
            System.out.println("1. create an account");
            System.out.println("2. already had an account");
            System.out.println("3. exit");
            int log = s1.nextInt();
            if(log==1)
            {
                d1.create(k);
                k++;   //increment the index in array
            }
            else if(log==2)
            {
               int b= d1.get();
                do {
                    System.out.println("1. Display details ");
                    System.out.println("2. deposit amount");
                    System.out.println("3. withdraw amount");
                    System.out.println("4. make Fixed deposit");
                    System.out.println("5. mini statements ");
                    System.out.println("6. Go to previous menu");
                    System.out.println("7. exit");
                    System.out.println("enter your choice...");
                    int x = s1.nextInt();
                    switch (x) {
                        case 1:
                            d1.display(b);
                            break;
                        case 2:
                            d1.deposit(b);
                            System.out.println("do you want to print receipt ?(y/n");
                            char rec=s1.next().charAt(0);
                            if(rec=='y')
                            {
                                d1.receipt(b, x);
                            }
                            break;

                        case 3:
                            d1.withdraw(b);
                            System.out.println("do you want to print receipt ?(y/n");
                            rec=s1.next().charAt(0);
                            if(rec=='y')
                            {
                                d1.receipt(b, x);
                            }
                            break;
                        case 4:
                            d1.fd(b);
                            break;
                        case 5:
                            d1.mini(b);
                            break;
                        case 6:
                            System.out.println("thank you");
                            break;
                        case 7:
                            System.out.println("thank you");
                            System.exit(0);
                        default:
                            System.out.println("error !!!....\n");
                            break;
                    }
                    System.out.println("Do you want to continue(y/n).");
                    ch = s1.next().charAt(0);

                } while (ch == 'y' || ch == 'Y');
            }
            else
            {
                System.exit(0);
            }
        }while(true);
    }
}
