import java.util.Scanner;
class calc
{
    int a,b,sum,diff,mult,mod;
    float div;

    public void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void add()
    {
        sum=this.a+this.b;
        System.out.println("sum = "+sum);
    }

    public void minus()
    {
        diff=this.a-this.b;
        System.out.println("minus = "+diff);
    }

    public void multiply()
    {
        mult=this.a*this.b;
        System.out.println("multiply = "+mult);
    }

    public void divide()
    {
        div=this.a/this.b;
        System.out.println("divide = "+div);
    }

    public void modulus()
    {
        mod=this.a%this.b;
        System.out.println("modulus = "+mod);
    }
}

public class calc_this_super extends calc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        calc_this_super obj =new calc_this_super();
        obj.set(a,b);
        do {
            System.out.println("\n1. add");
            System.out.println("2. minus");
            System.out.println("3. multiply");
            System.out.println("4. divide");
            System.out.println("5. modulus");
            System.out.println("6. exit");
            System.out.println("enter your choice : ");
            int ch=sc.nextInt();

            switch (ch)
            {
                case 1:
                    obj.add();
                    break;

                case 2:
                    obj.minus();
                    break;

                case 3:
                    obj.multiply();
                    break;

                case 4:
                    obj.divide();
                    break;

                case 5:
                    obj.modulus();
                    break;

                case 6:
                    System.exit(1);

            }
        }while(true);

    }
}
