import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class S1
{
    public static void main(String[] arg)
    {
        String n;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a string");
        n = obj.nextLine();
        System.out.println(n.toUpperCase());
    }
}
