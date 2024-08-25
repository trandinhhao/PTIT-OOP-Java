
import java.util.*;

public class J02005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> se = new HashSet<>();
        TreeSet<Integer> se1 = new TreeSet<>();
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i =0;i<n;i++) {
            se.add(sc.nextInt());
        }
        for (int i = 0; i<m;i++) {
            int tmp = sc.nextInt();
            if (se.contains(tmp)) {
                se1.add(tmp);
            }
        }
        for (Integer x : se1) {
            System.out.print(x + " ");
        }
    }
}
