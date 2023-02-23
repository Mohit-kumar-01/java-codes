import java.util.Scanner;
public class count_OddEven
{
    public static void main(String[] args)
    {
        int count_odd=0,count_even=0,i=1,a,sum_odd=0,sum_even=0;
        Scanner sc=new Scanner (System.in);
        while(i<=5)
        {
            System.out.println("enter a no :");
            a=sc.nextInt();
            if(a%2==0)
            {
                sum_even=a+sum_even;
                count_even++;
            }
            else
            {
                sum_odd=a+sum_odd;
                count_odd++;
            }
            i++;
        }
        System.out.println("Even : "+ count_even);
        System.out.println("su of even no. : "+sum_even+"\n");
        System.out.println("Odd : "+ count_odd);
        System.out.println("sum of odd no : "+sum_odd);
    }
}
