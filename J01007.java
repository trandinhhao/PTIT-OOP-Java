
import java.util.Scanner;

public class J01007 {

    public static long[] f = new long[100];

    public static void sieve() {
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }
    
    public static boolean check (long x) {
        for (int i=0;i<=92;i++) {
            if (f[i]== x) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        sieve();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            long x = sc.nextLong();
            if (check(x)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
