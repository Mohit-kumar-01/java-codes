import java.util.Scanner;
public class exp_handle3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your bank id");
        int id=sc.nextInt();
        int flag=0;

        try
        {
            int temp=id,count=0;
            while (temp!=0)
            {
                temp=temp/10;
                count++;
            }
            if(count==4)
            {
                flag=1;
            }
        }
        catch(Exception e)
        {
            if(flag==1)
            {
                System.out.println("plaese enter only 4 digit Id");
            }
        }
    }
}
