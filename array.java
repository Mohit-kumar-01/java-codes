import sun.applet.Main;

public class array
{
    public static void main(String[] args) {
        int[] n={1,2,9,6,8,3};
        for (int i=0;i<n.length;i++)
        {
            System.out.print(n[i]+",");
        }
        int sum=0;
        for (int i=0;i<n.length;i++)
        {
            sum+=n[i];

        }
        System.out.println("sum of elements is : "+sum);
        int max= n[0];
        for (int i=0;i<n.length;i++)
        {
              if (n[i]>max)
              {
                  max=n[i];
              }
              
        }
        System.out.println("max is "+max);
    }
}
