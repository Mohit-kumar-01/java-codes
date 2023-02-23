public class Fruit
{
    private double fprice;
    private String fname;
    Fruit(double fPrice, String fName)
    {
        fprice=fPrice;
        fname=fName;
    }

    Fruit(Fruit fruit)
    {
        System.out.println("\nafter invoking copy constructor");
        fprice= fruit.fprice;
        fname=fruit.fname;
    }

    double showprice()
    {
        return fprice;
    }

    String showname()
    {
        return fname;
    }

    public static void main(String[] args)
    {
        Fruit f1=new Fruit(399,"Grapes");
        System.out.println("name of fruit 1 is : "+f1.showname());
        System.out.println("price of fruit 2 is : "+f1.showprice());

        //using copy constructor
        Fruit f2=new Fruit(f1);
        System.out.println("name of fruit 2 is : "+f2.showname());
        System.out.println("price of fruit 2 is "+f2.showprice());
    }
}
