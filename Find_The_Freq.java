import java.util.Scanner;

public class Find_The_Freq {

        static int findFrequency(int A[], int x){
            int count=0;
            for(int i=0;i<A.length;i++)
            {
                if(A[i] == x)
                {
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements");
        int n = sc.nextInt();
        System.out.println("Element u want freq of ");
        int x = sc.nextInt();
        System.out.println("Enter the elemets of Array");
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Freq of Given Element is "+Find_The_Freq.findFrequency(arr,x));
    }
}
