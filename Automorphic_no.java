import java.util.Scanner;
public class Automorphic_no
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,s;
        System.out.println("enter a no : ");

        n=sc.nextInt();
        s=n*n;
        int temp=n,sq=s;
        int m1=0,m2=0;
        while (temp>0)
        {
            m1=(m1*10)+temp%10;
            m2=(m2*10)+s%10;
            temp/=10;
            s/=10;
        }
        System.out.println("no. is : "+n+"\nsquare is : "+sq);
        if(m1==m2)
        {

            System.out.println("automorphic");
        }
        else
            System.out.println("not automorphic");
    }
}
