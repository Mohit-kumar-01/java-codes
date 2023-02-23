import java.util.Scanner;
public class String_5
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        String s;
        System.out.println("enter a string :");
        s=sc.nextLine();
        System.out.println("the string is : "+s);
        char[] ch=new char[s.length()];
        for(int i=0;i<ch.length;i++)
        {
            ch[i]=s.charAt(i);
        }
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                ch[i]-=32;
            }
        }
        System.out.print("the string is : ");
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
    }
}
