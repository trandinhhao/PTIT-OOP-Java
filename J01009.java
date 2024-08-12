
import java.util.Scanner;

public class J01009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long cnt = 1;
        long n = sc.nextLong();
        long s = 0;
        for (long i = 1; i <= n; i++) {
            cnt *= i;
            s += cnt;
        }
        System.out.println(s);
    }
}
