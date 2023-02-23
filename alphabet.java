import java.util.Scanner;
public class alphabet
{
    public void alpha(char a)
    {
        for(int i=a+1;i<=122;i++)
        {
            char ch=(char)i;
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        char c=sc.next().charAt(0);
        alphabet ab=new alphabet();
        ab.alpha(c);
    }
}
