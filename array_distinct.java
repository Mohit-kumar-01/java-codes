public class array_distinct
{
    public static void main(String[] args) {
        int[] arr={2,4,5,2,1,5,2};
        int[] flag={0,0,0,0,0,0,0};
        int[] print={1,1,1,1,1,1,1};
        int[] count=new int[50];
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("distinct elements are ");
        for (int i=0;i<arr.length;i++)
        {
            if(flag[i]==0)
            {
                for (int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count[i]++;
                        flag[j]=1;
                        flag[i]=1;
                        print[i]=0;
                    }
                }
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            if (flag[i] == 1)
            {
                System.out.println(arr[i]+" :- "+(count[i]+1));
            }
        }
    }
}
