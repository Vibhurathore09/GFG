import java.util.Scanner;

public class reverse_squared_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0)

        {
            int sum =0;
            int N = sc.nextInt();
            System.out.println(N);
            int arr[] = new int[N];
            for(int i=0;i<N;i++)
            {
                arr[i] = sc.nextInt();
            }

            if(N%2==0)
            {
                for(int i=N-1;i>=0;i=i-2)
                {
                    sum =sum + (arr[i]*arr[i])  - (arr[i-1]*arr[i-1]);
                    System.out.println(sum);
                }
                System.out.println(sum);
            }
            else
            {
                for(int i=N-1;i>=1;i=i-2)
                {
                    sum =sum +(arr[i]*arr[i])  - (arr[i-1]*arr[i-1]);
                    System.out.println(sum);
                }
                sum = sum + arr[0]*arr[0];
                System.out.println(sum);
            }
        }
    }
}
