import java.util.Scanner;
class id_pswd
{
    String id="raju",pswd="12345", input_id,input_pswd;
    public void set(String id, String pswd)
    {
        this.input_id=id;
        this.input_pswd=pswd;
    }

    public void check_pswd()
    {
        if(this.input_id.equals(this.id) && this.input_pswd.equals(this.pswd))
        {
            System.out.println("Valid user id and password");
        }
        else
        {
            System.out.println("invalid user id and password");
        }
    }
}

public class password_this_super extends id_pswd {
    public static void main(String[] args) {
        System.out.println("// user id = 'raju'\n// password='12345'\n ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter user id : ");
        String user_id=sc.next();
        System.out.println("enter password");
        String password=sc.next();
        password_this_super p1=new password_this_super();
        p1.set(user_id,password);
        p1.check_pswd();
    }
}
