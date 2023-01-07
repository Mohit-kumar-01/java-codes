

import java.util.Scanner;

public class rev {
    public static void main(String arg[])
    {

        int n, r=0, temp, m,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no:");
        n=sc.nextInt();
        temp=n;
        while (temp>0)
        {
            m=temp%10;
            r=(r*10)+m;
            temp=temp/10;

            count++;
        }
        System.out.println(r);
        System.out.println("no of digits are :"+ count);
        if(r==n)
        {
            System.out.println("it is palindrom");
        }
        else
        {
            System.out.println("not  palindrom");
        }
    }
}
