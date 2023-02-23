abstract class bike
{
    abstract void run();
}
public class abstr_1 extends bike
{
    void run()
    {
        System.out.println("drive safely");
    }

    public static void main(String[] args) {
        abstr_1 a1=new abstr_1();
        a1.run();
    }
}
