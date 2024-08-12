
import java.util.Scanner;


public class J01008 {
    
    public static void check(long x) {
        for (int i=2;i<=Math.sqrt(x);i++) {
            if (x==1) break;
            int cnt = 0;
            while (x % i == 0) {
                cnt++;
                x/=i;
            }
            if (cnt>0) {
                System.out.print(i + "(" + cnt + ") ");
            }
        }
        if (x>1) System.out.print(x + "(1)");
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for (int i=1;i<=t;i++) {
            System.out.print("Test " + i + ": ");
            long n = sc.nextLong();
            check(n);
        }
    }
}
