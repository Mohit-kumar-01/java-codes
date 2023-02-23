class calculation
{
    int z;
    public void add(int x, int y)
    {
        z=x+y;
        System.out.println("sum is : "+z);
    }
    public void sub(int x,int y)
    {
        z=x-y;
        System.out.println("difference is : "+z);
    }
}
public class My_calculation extends calculation
{
    public void mult(int x, int y)
    {
        z=x*y;
        System.out.println("product is : "+z);
    }

    public static void main(String[] args) {
        int a=30,b=20;
        System.out.println("a= 30\nb=20");
        My_calculation m=new My_calculation();
        m.add(a,b);
        m.sub(a,b);
        m.mult(a,b);
    }
}
