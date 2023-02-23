class multithread extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e)
        {
            System.out.println("Eception is caught");
        }
    }
}
public class thread_1
{
    public static void main(String[] args)
    {
        int n=10;
        for (int i=0;i<n;i++)
        {
            multithread obj=new multithread();
            obj.start();
        }
    }
}