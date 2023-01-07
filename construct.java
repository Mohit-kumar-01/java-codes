class box
{
    double w,h,d;
    box()
    {
        w=h=d=0;
    }
    box(double width,double height,double depth)
    {
        w=width;
        h=height;
        d=depth;
    }
    box(double len)
    {
        w=h=d=len;

    }
    double volume()
    {
        return w*h*d;
    }

}

public class construct
{
    public static void main(String[] args) {
        box b1 = new box();
        box b2=new box(10,20,15);
        box b3=new box(8);

        System.out.println("vol of box 1 is : "+b1.volume());
        System.out.println("vol of box 2 is : "+b2.volume());
        System.out.println("vol of box 3 is : "+b3.volume());
    }
}