import java.util.Scanner;


class vowel
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a;
        System.out.println("enter a character");
        a=sc.next().charAt(0);
        if(a=='a' || a=='A')
        {
            System.out.println("it is a vowel");
        }
        else if(a=='o' || a=='O')
        {
            System.out.println("it is a vowel");
        }
        else if(a=='e' || a=='E')
        {
            System.out.println("it is a vowel");
        }
        else if(a=='i' || a=='I')
        {
            System.out.println("it is a vowel");
        }
        else if(a=='u' || a=='U')
        {
            System.out.println("it is a vowel");
        }
        else
        {
            System.out.println("not a vowel");
        }
    }
}