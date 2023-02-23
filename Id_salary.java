import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Scanner;

public class Id_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0, sal = 0, c = 0, in = 0;
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("for user "+i+" enter id");
            id=sc.nextInt();
            System.out.println("enter salary : ");
            sal=sc.nextInt();
            if(id>=107 && sal>=15000)
            {
                c=sal*5/100;
                in=sal*6/100;
                System.out.println("5% commission : "+c);
                System.out.println("6% interest : "+in);
                System.out.println("total salary : "+(sal+c+in));
            }
            else if(id<=106)
            {
                c=sal/100;
                in=sal/100;
                System.out.println("1 % commission : "+c);
                System.out.println("1 % interest :  "+in);
                System.out.println("total salary is : "+(sal+c+in));

            }
            System.out.println("");
        }
    }
}
