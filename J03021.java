
import java.util.*;
import java.math.*;

public class J03021 {

    public static String[] a = new String[10];

    public static boolean solve(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            int checkl = 0;
            int checkr = 0;
            char left = s.charAt(l);
            char right = s.charAt(r);
            for (int i = 2; i <= 9; i++) {
                for (char x : a[i].toCharArray()) {
                    if (left == x) {
                        checkl = i;
                    }
                    if (right == x) {
                        checkr = i;
                    }
                }
            }
            if (checkl != checkr) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void start() {
        a[2] = "ABC";
        a[3] = "DEF";
        a[4] = "GHI";
        a[5] = "JKL";
        a[6] = "MNO";
        a[7] = "PQRS";
        a[8] = "TUV";
        a[9] = "WXYZ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        start();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (solve(s.toUpperCase())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
