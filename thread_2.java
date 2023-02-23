class runthread implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println("thread "+ Thread.currentThread().getId()+" is running");
        }
        catch (Exception e)
        {
            System.out.println("Exception is cought");
        }
    }
}
public class thread_2
{
    public static void main(String[] args)
    {
        int n=10;
        for (int i=0;i<n;i++)
        {
            Thread obj = new Thread(new runthread());
            obj.run();
        }
    }
}
