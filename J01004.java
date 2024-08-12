
import java.util.Scanner;

public class J01004 {

    public static boolean check(long x) {
        if (x == 0 || x == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            if (check(x)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
