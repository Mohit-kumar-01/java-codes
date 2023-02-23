import java.util.Scanner;
class model
{
    int com, model;
    Scanner sc=new Scanner(System.in);
    public void get()
    {
        System.out.println("choose car company");
        System.out.println("1. Maruti \n2. Honda ");
        com=sc.nextInt();
        System.out.println("choose model ");
        if(com==1)
        {
            System.out.println("1. Alto 800\n2. Dzire");
            model=sc.nextInt();

        }
        else
        {
            System.out.println("1. City\n2. Amaze");
            model=sc.nextInt();
        }
    }

    public void show()
    {
        if(com==1&&model==1)
        {
            System.out.println("Company : Maruti");
            System.out.println("Model : Alto 800");
        }
        else if(com==1&&model==2)
        {
            System.out.println("Company : Maruti");
            System.out.println("Model : Dzire ");
        }
        else if (com==2&&model==1)
        {
            System.out.println("Company : Honda");
            System.out.println("Model : City ");
        }
        else if (com==2&&model==2)
        {
            System.out.println("Company : Honda");
            System.out.println("Model : Amaze");
        }
    }

}
class specs extends model
{
    String price;
    public void details()
    {
        if(com==1&&model==1)
        {
            price="4 lac";
        }
        else if(com==1&&model==2)
        {
            price="8 lac";
        }
        else if(com==2&&model==1)
        {
            price="20 lac";
        }
        else if(com==2&&model==2)
        {
            price="12 lac";
        }

        System.out.println("price : "+price);

    }
}
public class car extends specs
{
    public static void main(String[] args) {
        car c=new car();
        c.get();
        c.show();
        c.details();
    }
}
