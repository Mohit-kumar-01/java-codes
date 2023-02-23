import java.util.Scanner;
class intrest
{
    int rate, am, byaaj;
    public void intrest(int a,int r)
    {
        this.am=a;
        this.rate=r;
    }
    public void calculate()
    {
        this.byaaj=(this.am/100)*this.rate;
        System.out.println("\nintrest amount : "+byaaj);
    }
}
class this_super_2 extends intrest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount");
        int amount=sc.nextInt();
        System.out.println("enter the interest rate in % ");
        int rate =sc.nextInt();
        this_super_2 obj =new this_super_2();
        obj.intrest(amount,rate);
        obj.calculate();

        System.out.println("\ntotal amount : "+(amount+obj.byaaj));


    }
}