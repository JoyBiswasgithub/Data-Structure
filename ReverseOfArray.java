import java.util.*;
public class ReverseOfArray {
    public static void main(String str[])
    {
        int i;
        System.out.println("Enter the range of array :");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array element");
        for (i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        int st, end, temp;
        st=0;
        end=size-1;

        while (end>st)
        {
            temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        System.out.println("Inverse of Array is :");
        for (i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

