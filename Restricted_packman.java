import java.io.*;
import java.util.*;
public class Restricted_packman
{
    public static void main(String args[]) throws IOException
    {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t > 0){
                int m = sc.nextInt();
                int n = sc.nextInt();
                Solution ob = new Solution();
                System.out.println(ob.candies(m,n));
                t--;
            }
    }
}
class Solution{
    static int candies(int m, int n)
    {
        return (m-1)*(n-1)/2;
    }
}
