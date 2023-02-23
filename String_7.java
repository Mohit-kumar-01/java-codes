import java.util.Scanner;
public class String_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        int i, j;
        System.out.println("enter first string :");
        s1 = sc.nextLine();
        System.out.println("enter second string : ");
        s2 = sc.nextLine();
        char[] c1 = new char[s1.length()], c2 = new char[s2.length()];
        for (i = 0, j = 0; i < c1.length & j < c2.length; i++, j++) {
            c1[i] = s1.charAt(i);
            c2[j] = s2.charAt(j);
        }
        char[] ch = new char[c1.length + c2.length];
    }
}