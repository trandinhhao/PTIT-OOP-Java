
import java.util.*;
import java.math.*;

public class J03013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.subtract(b).abs();
            StringBuilder sb = new StringBuilder(c.toString());
            int len = Math.max(a.toString().length(), b.toString().length());
            while (sb.length() < len) {
                sb.insert(0, '0');
            }
            System.out.println(sb.toString());
        }
    }
}
