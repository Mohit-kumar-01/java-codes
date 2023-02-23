public class Shift_right
{
    public static void main(String[] args) {
        int arr[]={5,8,6,9,4,3,2,7},i;
        System.out.println("the given array is : ");
        for (i=0;i<8;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println("\nafter right shift");
        int first=arr[7];
        for (i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=first;
        for (i=0;i<arr.length;i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
