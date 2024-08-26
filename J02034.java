
import java.util.*;

public class J02034 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashSet<Integer> se = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            se.add(a[i]);
        }
        int maxx = a[n - 1];
        if (n == maxx) {
            System.out.println("Excellent!");
        } else {
            for (int i = 1; i <= maxx; i++) {
                if (!se.contains(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}
