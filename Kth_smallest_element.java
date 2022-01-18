import java.util.*;

public class Kth_smallest_element {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n= sc.nextInt();
        System.out.println("Enter K term for Array");
        int K = sc.nextInt();
        System.out.println("Enter Elements of Array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Kth smallest element in the Arrays is "+arr[K-1]);

    }
}
