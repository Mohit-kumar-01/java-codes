abstract class shapes
{
    abstract void draw();
}
class rect extends shapes
{
    void draw ()
    {
        System.out.println("drawing circle");
    }
}
public class abstr_2 extends shapes
{
    public void draw()
    {
        System.out.println("drawing shapes");
    }

    public static void main(String[] args) {
        abstr_2 s=new abstr_2();
        s.draw();
    }
}
