import java.util.Scanner;
public class oop_minmax
{
    void max (int a,int b)
    {
        if(a>b)
        {
            System.out.println(a+" is max");
        }
        else
        {
            System.out.println(b+" is max");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a :");
        int x=sc.nextInt();
        System.out.println("enter b :");
        int y=sc.nextInt();
        oop_minmax obj=new oop_minmax();
        obj.max(x,y);
    }
}
