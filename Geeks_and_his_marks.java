import java.util.Scanner;

public class Geeks_and_his_marks {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-->0)
        {
            int count =0;
            int arr[] = new int[2];
            for(int i=0;i<2;i++)
            {
                arr[i] = sc.nextInt();
            }

            int a[] = new int[arr[0]];
            for(int i=0;i<arr[0];i++)
            {
                a[i] = sc.nextInt();
            }
            for(int i=0;i<arr[0];i++ )
            {
                if(arr[1]<a[i])
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
