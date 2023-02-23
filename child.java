class grandpa{
    public void show1()
    {
        System.out.println("this is grandpa");
    }
}
class father extends grandpa
{
    public void show2()
    {
        System.out.println("this is father");
    }
}

public class child extends father
{
    public void show()
    {
        System.out.println("this is child");
    }

    public static void main(String[] args) {
        child ch= new child();
        ch.show1();
        ch.show2();
        ch.show();
    }
}
