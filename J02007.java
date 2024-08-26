
import java.util.*;

public class J02007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 1; x <= t; x++) {
            int n = sc.nextInt();
            LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                if (mp.containsKey(tmp)) {
                    mp.put(tmp, mp.get(tmp) + 1);
                } else {
                    mp.put(tmp, 1);
                }
            }
            System.out.println("Test " + x + ":");
            for (Map.Entry<Integer, Integer> et : mp.entrySet()) {
                System.out.println(et.getKey() + " xuat hien " + et.getValue() + " lan");
            }
        }
    }
}
