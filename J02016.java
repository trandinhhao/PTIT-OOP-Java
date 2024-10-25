
import java.util.*;

public class J02016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Long> a = new HashSet<>();
            long[] aa = new long[n];
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                aa[i] = x * x;
                a.add(x * x);
            }
            boolean check = false;
            for (int i = 0; i < n; i++) {
                if (!check) {
                    for (int j = i + 1; j < n; j++) {
                        if (a.contains(aa[i] + aa[j])) {
                            check = true;
                            break;
                        }
                    }
                }
            }
            if (check) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
