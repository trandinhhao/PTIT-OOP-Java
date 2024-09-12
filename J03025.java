
import java.util.*;
import java.math.*;

public class J03025 {

    public static boolean check(String s) {
        int l = 0;
        int r = s.length() - 1;
        int cnt = 0;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                cnt++;
            }
            l++;
            r--;
        }
        if ((s.length() % 2 == 0 && cnt == 1) || (s.length() % 2 == 1 && cnt <= 1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String s = sc.nextLine();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
