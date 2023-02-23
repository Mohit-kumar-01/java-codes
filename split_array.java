public class split_array
{
    public static void main(String[] args)
    {
        int arr[]={1,5,3,4,8,6,2,7},sum1=0,sum2=0,i;
        System.out.println("Given array is : ");
        for (i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println("\nAfter splitting the array : ");
        System.out.println("the first half is :");
        for (i=0;i<arr.length/2;i++)
        {
            System.out.print(arr[i]+",");
            sum1+=arr[i];
        }
        System.out.println("\nthe sum of first half array is : "+sum1+"\n");
        System.out.println("the second half is : ");
        for (i=arr.length/2;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
            sum2+=arr[i];
        }
        System.out.println("\nthe sum of second half array is : "+sum2+"\n");

    }
}
