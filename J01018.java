
import java.util.*;

public class J01018 {

    public static boolean solve(String s) {
        int tong = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 2) {
                return false;
            }
            tong += s.charAt(i) - '0';
        }
        return tong % 10 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (solve(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
