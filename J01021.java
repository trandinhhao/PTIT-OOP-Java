
import java.util.*;

public class J01021 {

    public static long res = (long) (1e9 + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong(), b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            long tmp = 1;
            while (b > 0) {
                if (b % 2 == 1) {
                    tmp *= a;
                    tmp %= res;
                }
                a *= a;
                a %= res;
                b /= 2;
            }
            System.out.println(tmp);
        }
    }
}
