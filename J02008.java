
import java.util.*;
import java.math.*;

public class J02008 {
    
    public static long gcd(long a, long b) {
        if (b==0) {
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            long n = sc.nextLong();
            long bcnn = 1;
            for (long i =1;i<=n;i++) {
                bcnn = bcnn*i / (gcd(bcnn,i));
            }
            System.out.println(bcnn);
        }
    }
}
