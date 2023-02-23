import java.net.SocketOption;
import java.util.Scanner;
public class func_over
{
    void sum(int a,int b)
    {
        System.out.println("Sum is "+(a+b));
    }
    void sum(int a,int b, int c)
    {
        System.out.println("Sum is "+(a+b+c));
    }

    public static void main(String[] args) {
        func_over f= new func_over();
        f.sum(10,20);
        f.sum(20,30,40);
    }
}
