
import java.util.*;
import java.math.*;

public class J03024 {
    
    public static void solve(String s) {
        int chan = 0;
        int le = 0;
        for (char x : s.toCharArray()) {
            if (Character.isAlphabetic(x)) {
                System.out.println("INVALID");
                return;
            } else if ((x -'0') % 2 == 0) {
                chan++;
            } else {
                le++;
            }
        }
        if (s.length() % 2 == 0 && chan > le|| s.length() % 2 == 1 && chan < le) {
            System.out.println("YES");
            return;
        } else {
            System.out.println("NO");
            return;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0) {
            String s = sc.nextLine();
            solve(s);
        }
    }
}
