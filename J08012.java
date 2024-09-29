
import java.util.HashSet;
import java.util.Scanner;

public class J08012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[4];
        HashSet<Integer> se = new HashSet<>();
        for (int i = 0; i <= 3; i++) {
            a[i] = sc.nextInt();
        }
        int res = -1;
        if (a[0] == a[2] || a[0] == a[3]) {
            res = a[0];
        } else if (a[1] == a[2] || a[1] == a[3]) {
            res = a[1];
        }
        if (res == -1) {
            System.out.println("No");
        } else {
            boolean check = true;
            for (int i = 0; i < 4; i++) {
                if (a[i] != res) {
                    se.add(a[i]);
                }
            }
            for (int i = 2; i < t-1; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x != res && y != res) {
                    check = false;
                } else {
                    if (x == res) {
                        se.add(y);
                    } else {
                        se.add(x);
                    }
                }
            }
            if (check && se.size() == t-1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
