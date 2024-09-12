
import java.util.*;
import java.math.*;

public class J01022 {

    public static long[] s = new long[100];

    public static void start() {
        s[1] = 1;
        s[2] = 1;
        for (int i = 3; i < 93; i++) {
            s[i] = s[i - 2] + s[i - 1];
        }
    }

    public static int fibo(int n, long k) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            if (k <= s[n - 2]) {
                return fibo(n - 2, k);
            } else {
                return fibo(n - 1, k - s[n - 2]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        start();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(fibo(n, k));
        }
    }
}
