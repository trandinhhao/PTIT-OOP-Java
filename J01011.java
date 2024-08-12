
import java.util.Scanner;

public class J01011 {

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long tmp = gcd(a, b);
            long tmp1 = (1l * a * b) / tmp;
            System.out.println(tmp1 + " " + tmp);
        }
    }
}
