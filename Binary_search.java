import java.util.Scanner;
class Binary_search
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int n;
//        System.out.println("enter the size of array");
//        n= sc.nextInt();

        int[] arr={1,4,55,32,9,6};
        int first=0,last,key;
        last=arr.length-1;
        int mid=(first+last)/2;
        System.out.println("array is : ");
        for (int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();

        System.out.println("enter the element to be search : ");
        key=sc.nextInt();

        while (first<=last)
        {
            if (arr[mid]<key)
            {
                first=mid+1;
            }
            else if (arr[mid]==key)
            {
                System.out.println("element found at position : "+(mid+1));
                break;
            }
            else
            {
                last=mid-1;
            }

            mid=(first+last)/2;
        }
        if (first > last)
        {
            System.out.println("element not found");
        }



    }
}