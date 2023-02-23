interface acedemics
{
    void result();
}

interface extras
{
    void result();
}


public class interface_2 implements acedemics,extras
{
    public void result()
    {
        System.out.println("Result : 99%");
    }
    public static void main(String[] args) {
        interface_2 t=new interface_2();
        t.result();
    }
}
