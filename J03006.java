
import java.util.*;

public class J03006 {

    public static boolean check(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r) || (s.charAt(l) - '0') % 2 == 1) {
                return false;
            }
            l += 1;
            r -= 1;
        }
        return true;
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
