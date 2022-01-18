import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextLong();
        }
        compute obj = new compute();

        pair product = obj.getMinMax(a,n);
        System.out.println(product.first+" "+product.second);
    }

}
class pair{
    long first, second;
    public pair(long first,long second)
    {
        this.first = first;
        this.second = second;
    }

}
class compute
{
    static pair getMinMax(long a[], long n)
    {
        long min=a[0],max=a[0];//Write your code here
        for(int i=1;i<n;i++)
        {
            if(max<a[i])
            {
                max = a[i];
            }
            if(min>a[i])
            {
                min = a[i];
            }
        }
        return (new pair(min,max));
    }
}

