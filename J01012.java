
import java.util.*;
import java.math.*;

public class J01012 {

    public static int check(int x) {
        int cnt = 0;
        if (x < 2) {
            return 0;
        }
        for (int i = 1; i <= Math.sqrt(x); i ++) {
            if (x % i == 0) {
                if (i % 2 == 0) {
                    cnt += 1;
                }
                if ((x / i) % 2 == 0 && i != Math.sqrt(x)) {
                    cnt += 1;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            System.out.println(check(x));
        }
    }
}
