
import java.util.*;

public class J02006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> se = new TreeSet<>();
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            se.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            se.add(sc.nextInt());
        }
        for (Integer x : se) {
            System.out.print(x + " ");
        }
    }
}
