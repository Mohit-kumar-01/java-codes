import java.util.Scanner;
public class array_menu
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int i,j,choice;
        char ch='y';
        do
        {
            System.out.println("\nWhat operation do you want from the followings :- ");
            System.out.println("1. array insertion");
            System.out.println("2. update the array");
            System.out.println("3. searching an element");
            System.out.println("4. deletion od an element");
            System.out.println("5. print the array");
            System.out.print("Enter your choice here : ");
            choice=sc.nextInt();
            System.out.println("");
            switch (choice)
            {
                case 1:
                    System.out.println("enter the elements : ");
                    for (i=0;i<5;i++)
                    {
                        arr[i]=sc.nextInt();
                    }
                    System.out.println("insertion is completed...");
                    System.out.println("New array is : ");
                    break;
                case 2:
                    System.out.println("which element do you want to update (enter the index) :");
                    int index=sc.nextInt();
                    System.out.println("enter the new value");
                    int n=sc.nextInt();
                    for (i=0;i<5;i++)
                    {
                        if (i==index)
                        {
                            arr[i]=n;
                        }
                    }
                    System.out.println("updation successful");
                    break;
                case 3:
                    System.out.println("enter the element you want to search : ");
                    n=sc.nextInt();
                    for (i=0;i<5;i++)
                    {
                        if (arr[i]==n)
                        {
                            System.out.println("element found at index : "+i);
                        }
                    }
                    break;
                case 4:
                    System.out.println("which element do you want to delete (enter the index) :");
                    j=sc.nextInt();
                    for(i=j;i<arr.length-1;i++)
                    {
                        arr[i]=arr[i+1];
                    }
                    System.out.println();
                    System.out.println("deletion successful");
                    System.out.println("the new array is : ");
                    for (i=0;i<4;i++)
                    {
                        System.out.println(arr[i]);
                    }
                    break;
                case 5:
                    System.out.println("the array is : ");
                    for (i=0;i<5;i++)
                    {
                        System.out.println(arr[i]);
                    }

            }

            System.out.println("do you want to continue (y/n) :");
            ch=sc.next().charAt(0);

        }while (ch=='y'||ch=='Y');

    }
}
