import java.util.Scanner;
public class String_casecahnge
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String l;
        System.out.println("enter a strings ");
        l=sc.nextLine();
        char[] c=new char[l.length()];
        for(int i=0;i<c.length;i++)
        {
            c[i]=l.charAt(i);
        }
        for(int i=0;i<c.length;i++)
        {
            c[i]-=32;
        }
        System.out.println("UPPER case :");
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]);
        }
    }


}
