import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner; // Time Limit Exceded

public class Gfg_new_System {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-->0)
        {
            int count=0;
            int N = sc.nextInt();
            int index[] = new int[N];
            String a[] = new String[N];
            for(int i=0;i<N;i++)
            {
                a[i] = sc.next();
                index[i] = 0;

            }
            for(int i=0;i<N;i++)
            {
                count =0;
                for(int j=i+1;j<N;j++)
                {

                    if(a[i].equals(a[j]))
                    {
                        count++;
                        index[j]=1;
                        a[j] =a[j] +count;
                    }
                }
            }
            for(int i=0;i<N;i++)
            {
                if(index[i] ==0)
                    System.out.print("Verified ");
                else if(index[i]==1)
                    System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
