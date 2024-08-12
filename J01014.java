
import java.util.Scanner;

public class J01014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long save = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                while (n % i == 0) {
                    n /= i;
                    save = i;
                }
            }
            if (n > 1) {
                save = n;
            }
            System.out.println(save);
        }
    }
}
