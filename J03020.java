
import java.util.*;
import java.math.*;

public class J03020 {

    public static boolean check(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (check(s)) {
                if (mp.containsKey(s)) {
                    mp.put(s, mp.get(s) + 1);
                } else {
                    mp.put(s, 1);
                }
            }
        }
        int maxx = -1;
        for (Map.Entry<String, Integer> x : mp.entrySet()) {
            maxx = Math.max(maxx, x.getKey().length());
        }
        for (Map.Entry<String, Integer> x : mp.entrySet()) {
            if (x.getKey().length() == maxx) {
                System.out.println(x.getKey() + " " + x.getValue());
            }
        }
    }
}
