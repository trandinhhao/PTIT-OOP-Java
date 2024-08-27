
import java.util.*;

public class J03008 {

    public static boolean check(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r) || s.charAt(l) == '0' || s.charAt(l) == '1' || s.charAt(l) == '4' || s.charAt(l) == '6' || s.charAt(l) == '8' || s.charAt(l) == '9') {
                return false;
            }
            l++;
            r--;
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
