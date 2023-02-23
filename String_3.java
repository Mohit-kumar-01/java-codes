import java.util.Scanner;
public class String_3
{
    public static void main(String[] args) {
        String name;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name");
        name=sc.nextLine();
        System.out.println("the name is : "+name);
        for(i=name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i));
        }


    }
}
