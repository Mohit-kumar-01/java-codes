public class practice_array_1
{
    public static void main(String[] args)
    {
        int a1[]={1,5,2,3,1},a2[]={6,7,8,9,0},i,j=4;
        int sum[]=new int[5];
        System.out.println("array 1 : ");
        for (i=0;i<5;i++)
        {
            System.out.println(a1[i]+",");
        }
        System.out.println("\narray 2 : ");
        for (i=0;i<5;i++)
        {
            System.out.println(a2[i]+",");
        }

        for(i=0;i<5&&j>=0;i++,j--)
       {
           sum[i]= a1[i] +a2[j];
       }
        System.out.println("\nthe sum is : (array 1 + reverse of array 2");
        for (i=0;i<5;i++)
        {
            System.out.println(sum[i]+",");
        }

    }
}
