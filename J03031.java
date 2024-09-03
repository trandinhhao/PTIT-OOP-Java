
import java.util.*;
import java.math.*;

public class J03031 {

    public static boolean check(String s, int n) {
        if (s.length() < n) {
            return false;
        }
        HashMap<Character, Integer> mp = new HashMap<>();
        for (Character x : s.toCharArray()) {
            if (mp.containsKey(x)) {
                mp.put(x, mp.get(x) + 1);
            } else {
                mp.put(x, 1);
            }
        }
        int du = 0;
        int size = mp.size();
        Set<Map.Entry<Character, Integer>> et = mp.entrySet();
        for (Map.Entry<Character, Integer> x : et) {
            du += x.getValue();
        }
        int kq = Math.min(n,du);
        if (size + kq >= 26) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int n = sc.nextInt();
            sc.nextLine();
            if (check(s, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
