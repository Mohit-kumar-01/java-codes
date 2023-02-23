import java.util.Scanner;
class even_odd
{
    int n;
    public void set(int n)
    {
       this.n=n;
    }
    public void odd_even()
    {
        if(this.n%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}

class maths extends even_odd
{
    Scanner sc=new Scanner(System.in);
    public void is_oddeven()
    {
        System.out.println("enter a number");
        super.n=sc.nextInt();
        super.odd_even();
    }
}

class this_super
{
    public static void main(String[] args) {
        maths obj =new maths();
        obj.is_oddeven();

    }
}


