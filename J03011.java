
import java.util.*;
import java.math.*;

public class J03011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            System.out.println(a.gcd(b));
        }
    }
}
