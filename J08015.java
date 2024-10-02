
import java.util.HashMap;
import java.util.Scanner;

public class J08015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            HashMap<Long, Integer> mp = new HashMap<>();
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (mp.containsKey(a[i])) {
                    mp.put(a[i], mp.get(a[i]) + 1);
                } else {
                    mp.put(a[i], 1);
                }
            }
            for (int i = 0; i < n; i++) {
                int tmp = mp.get(a[i]) - 1;
                mp.put(a[i], tmp);
                long x = k - a[i];
                if (mp.containsKey(x)) {
                    cnt += mp.get(x);
                }
            }
            System.out.println(cnt);
        }
    }
}
