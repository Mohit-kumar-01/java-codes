import java.util.Scanner;

public class leap
{
    public static void main(String[] args)
    {
        int yr;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        yr=sc.nextInt();

        if((yr%4==0)||((yr%100==0)&&(yr%400==0)))
        {
            System.out.println("it is a leap year.");
        }
        else
        {
            System.out.println("it is not a leap year.");
        }

    }
}
