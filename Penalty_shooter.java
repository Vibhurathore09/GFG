import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Penalty_shooter {
    static List<Integer> goals(int X, int Y, int Z)
    {
        // code here
        List<Integer> l = new ArrayList<Integer>(2);
        int geek=0,nerd=0;
        while(Z!=1)
        {
            if(X%Z==0)
            {
                X--;
                geek++;
            }
            else if(Y%Z==0)
            {
                Y--;
                nerd++;
            }
            else
            {
                Z--;
            }
        }
        l.add(geek);
        l.add(nerd);
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0)
        {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            Penalty_shooter ob = new Penalty_shooter();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.goals(X, Y, Z);
            System.out.println(ans.get(0) + " " + ans.get(1));
        }
    }
}
