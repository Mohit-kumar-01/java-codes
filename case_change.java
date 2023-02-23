import java.util.Scanner;
public class case_change
{
    public void convert(String a)
    {
        char[] ch=new char[a.length()];
        for(int i=0;i<a.length();i++)
        {
            ch[i]=a.charAt(i);
        }
        for (int i=0;i<ch.length;i++)
        {
            int j=ch[i];
            if(j<95)
            {
                j+=32;
            }
            else
            {
                j-=32;
            }
            char c=(char)j;
            System.out.print(c);
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        case_change cc=new case_change();
        System.out.println("enter a string");
        String s=sc.nextLine();
        cc.convert(s);
    }
}
