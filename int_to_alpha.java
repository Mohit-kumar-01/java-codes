import java.util.Scanner;

public class int_to_alpha
{
    public static void main(String[] args) {
        int n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        n=sc.nextInt();
        int[] num={0,1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19};
        String[] ones ={"zero","one","two","three","four","five","six","seven","eight","nine","tem","eleven","twelve","thirteen","fourteen","fifteen","sixteen","eighteen","ninteen"};
        String[] tens={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
        temp=n;
        int[] n1= new int[2];
        int i,j;
        while(temp!=0)
        {
            for (i=0;i<2;i++)
            {
                for (j=0;j<20;j++)
                {
                    if((n%10)==num[j]);
                    {
                    }
                }

            }
        }



    }
}
