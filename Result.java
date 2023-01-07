import java.util.Scanner;

public class Result
{
    public static void main(String[] args)
    {
        int p,c,m,cs,eng;
        String name,fname;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter name");
        name =sc.nextLine();
        System.out.println("enter father's name");
        fname=sc.nextLine();
        System.out.println("enter marks of physics");
        p=sc.nextInt();
        System.out.println("enter marks of chemistry");
        c=sc.nextInt();
        System.out.println("enter marks of maths");
        m=sc.nextInt();
        System.out.println("enter marks of computer science");
        cs=sc.nextInt();
        System.out.println("enter marks of english");
        eng=sc.nextInt();

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tCBSE RESULT");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tCLASS 12");
        System.out.println("*****---------------------------------------------------------------------------------------------*****");
        System.out.println("NAME : "+name+"\nFATHER NAEME : "+fname);
        System.out.println("\n\n\nSubject name \t\t\t\t\t"+"marks obtained \t\t\t\t\t"+"maximum marks\n");
        System.out.println("Physics \t\t\t\t\t\t\t"+p+"\t\t\t\t\t\t\t\t100");
        System.out.println("Chemistry \t\t\t\t\t\t\t"+c+"\t\t\t\t\t\t\t\t100");
        System.out.println("Maths \t\t\t\t\t\t\t\t"+m+"\t\t\t\t\t\t\t\t100");
        System.out.println("Computer science \t\t\t\t\t"+cs+"\t\t\t\t\t\t\t\t100");
        System.out.println("English \t\t\t\t\t\t\t"+eng+"\t\t\t\t\t\t\t\t100");
        System.out.println("*****---------------------------------------------------------------------------------------------*****");
        int tt=p+c+m+cs+eng;
        float per=tt/5;
        System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  \t \t \t \t \t \t \t Total="+tt);
        System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  \t \t \t \t \t \t \t percentage="+per+"%");
        if(per<35.00)
        {
            System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  \t \t \t \t \t \t \t *FAIL*");
        }
        else
        {
            System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t  \t \t \t \t \t \t \t *PASS*");

        }

    }
}
