import java.io.*;
public class sum_of_array
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(bi.readLine());//test cases
        while(t>0)
        {
            int n= Integer.parseInt(bi.readLine());//array size
            int arr[] = new int[n];
            String[] strNums;
            strNums = bi.readLine().split(" ");
            for (int i = 0; i < strNums.length; i++)
            {
                arr[i] = Integer.parseInt(strNums[i]);
            }
            int sum=0;
            for (int i=0;i<n;i++)
            {
                sum+=arr[i];
            }
            System.out.println(sum);
            t--;
        }
    }
}
