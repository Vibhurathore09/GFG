import java.util.Scanner;

public class Reverse_A_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverseWord(str));
    }
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int len = str.length();
        //System.out.println(len);
        String s ="";
        char a[] = str.toCharArray();
        for(int i=len-1;i>=0;i--)
        {
            //System.out.println(a[i]);
            s = s+a[i];
            //System.out.println(s);
        }
        return s;

    }
}
