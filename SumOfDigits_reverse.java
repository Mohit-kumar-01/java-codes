import java.util.Scanner;

public class SumOfDigits_reverse
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,m=0,rev=0;
        System.out.println("Enter a no");
        n=sc.nextInt();
        int temp=n;
        while (temp!=0)
        {
            m=temp%10;
            sum=sum+m;
            temp=temp/10;
        }
        System.out.println("sum of digit is "+sum);
        while(sum!=0)
        {
            m=sum%10;
            rev=rev*10+m;
            sum=sum/10;
        }
        System.out.println("reverse of sum  : "+rev);
    }
}
