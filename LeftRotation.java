import java.util.Scanner;

public class LeftRotation {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int i;
        int arr[]=new int[n];
        for (i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        
            int temp = arr[0];
            int x=1;
            for (i=0; i<n; i++)
            {
                if (i<(n-1))
                {
                    arr[i]=arr[i+1];
                }
                if (i==(n-1) && x<=r)
                {
                    arr[i]=temp;
                    temp=arr[0];
                    x++;
                    i=0;
                }
            }
        
        for (i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }    
}
