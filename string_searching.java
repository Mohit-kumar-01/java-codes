import java.util.Scanner;
public class string_searching
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        String s;
        int i;
        System.out.println("enter a string ");
        s=sc.nextLine();
        char[] ch=new char[s.length()];
        for(i=0;i<ch.length;i++)
        {
            ch[i]=s.charAt(i);
        }
        int flag=0;
        System.out.println("enter a character to be searched :");
        char a=sc.next().charAt(0);
        for(i=0;i<ch.length;i++)
        {
            if(ch[i]==a)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("character is found at index : "+i);
        }
        else {
            System.out.println("character not found");
        }

    }
}
