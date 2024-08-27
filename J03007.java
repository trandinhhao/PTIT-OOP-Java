
import java.util.*;

public class J03007 {

    public static boolean check(String s) {
        int l = 0;
        int r = s.length() - 1;
        int tong = 0;
        if (s.charAt(l) != '8' && s.charAt(r) != '8') {
            return false;
        }
        while (l<r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            tong += s.charAt(l) + s.charAt(r) - '0' - '0';
            l++;
            r--;
        }
        return tong % 10 == 0;
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