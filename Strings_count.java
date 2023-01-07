import java.util.Scanner;
public class Strings_count
{
    public static void main(String[] args) {
        String st="My name is Mohit";
        int i,count=0;
        for (i=0;i<st.length();i++)
        {
            if (st.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println("the string is:\n"+st);
        System.out.println("total no of characters are : "+count);
    }
}
