interface p1
{
    default void show()
    {
        System.out.println("default p1");
    }
}

interface p2
{
    default void show()
    {
        System.out.println("default p2");
    }
}
class test_1 implements p1,p2
{
    public void show()
    {
        p1.super.show();
        p2.super.show();
    }

    public static void main(String[] args) {
        test_1 t1=new test_1();
        t1.show();
    }
}
