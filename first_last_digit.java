import java.util.Scanner;
public class first_last_digit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number");
        n=sc.nextInt();
        int sum=0,temp=n,length=0;
        while(temp!=0)
        {
            temp=temp/10;
            length++;
        }
        System.out.println("number of digit is : "+length);
        int m=0,count=1;
        while(n!=0)
        {

            if(count==1||count==length)
            {
                sum+=n%10;
            }
            n=n/10;
            count++;
        }
        System.out.println("sum of 1st and last digit : "+sum);

    }
}
