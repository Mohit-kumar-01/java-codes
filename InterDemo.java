

interface Bike
{
           default void display()
           {
               System.out.println("Bike");
           }
           void runBike();
}

interface Car
{
    default void display()
    {
        System.out.println("Car");
    }
    void runCar();
}


public class InterDemo implements Car,Bike
{
    public void runCar()
    {
        System.out.println("Run Car");
    }
    public void display()
    {
        Car.super.display();
        Bike.super.display();
    }
    public void runBike()
    {
        System.out.println("Run Bike");
    }

    public static void main(String[] args)
    {
        InterDemo obj=new InterDemo();
        obj.runCar();
        obj.runBike();
        obj.display();
    }
}
