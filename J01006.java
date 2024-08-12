
import java.util.Scanner;


public class J01006 {
    public static long[] f = new long[100];
    public static void sieve() {
        f[0]=0;
        f[1]=1;
        for (int i=2;i<=92;i++) {
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static void main(String[] args) {
        sieve();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            System.out.println(f[x]);
        }
    }
}
