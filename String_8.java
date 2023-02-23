import java.util.Locale;
import java.util.Scanner;
public class String_8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a name : ");
        String s=sc.nextLine();
        System.out.println("Upper case : "+s.toUpperCase());
        System.out.println("lower case : "+s.toLowerCase());
    }
}
