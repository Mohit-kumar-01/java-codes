public class String_6
{
    public static void main(String[] args) {
        char[] c1={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] c2={'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        String s="mohit";
        System.out.println("the given string is : "+s);
        char[] ch=new char[s.length()];
        int i,j;
        for (i=0;i<ch.length;i++)
        {
            ch[i]=s.charAt(i);
        }
        for (i=0;i<ch.length;i++)
        {
            for (j=0;j<c1.length;j++)
            {
                if(s.charAt(i)==c1[j])
                {
                    ch[i]=c2[j];
                }
            }
        }
        System.out.print("new string is : ");
        for (i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
    }
}
