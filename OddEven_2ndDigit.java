import java.util.Scanner;
public class OddEven_2ndDigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, mod=0, temp;
        System.out.println("enter a no : ");
        n=sc.nextInt();
        temp=n;
        while(temp>=10)
        {
            mod=temp%10;
            temp=temp/10;
        }
        System.out.println("the second digit is : "+mod);
        if(mod%2==0)
        {
            System.out.println("second digit is even");
        }
        else
        {
            System.out.println("second digit is odd");
        }

    }

}
