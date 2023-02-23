import java.util.Scanner;
public class reverse_of_no
{
    public static void main(String[] args)
    {
        int x,temp,mod,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        x= sc.nextInt();
        temp=x;
        while(temp!=0)
        {
            mod=temp%10;
            rev=rev*10+mod;
            temp=temp/10;
        }
        System.out.println("the reverse is : "+rev);

    }
}
