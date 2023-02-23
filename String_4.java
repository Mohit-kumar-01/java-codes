public class String_4
{
    public static void main(String[] args) {
        String s="mynameismohit";
        int i,j;
        char temp;
        System.out.println("the given string is : "+s);
        char[] ch=new char[s.length()];
        for(i=0;i<s.length();i++)
        {
            ch[i]=s.charAt(i);
        }
        for(i=0;i<s.length()-1;i++)
        {
            for(j=i;j<=s.length()-1;j++)
            {
                if(ch[i]>ch[j])
                {
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        System.out.println("the sorted string is : ");
        for(i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }

    }
}
