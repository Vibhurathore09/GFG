import java.util.Scanner;

public class Numbers_with_even_noOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s[] = new int[n];
        for(int i=0;i<n;i++)
        {
            s[i] = sc.nextInt();
        }
        int count=0;
        //int numdigit[] = new int[n];
        for(int i=0;i<n;i++)
        {
            int d=0;
            while(s[i]>0)
            {
                s[i] = s[i]/10;
                d++;
            }
            if(d%2==0)
            {
                count++;
            }
            //System.out.println(d);i

        }
        System.out.println(count);

    }
}
