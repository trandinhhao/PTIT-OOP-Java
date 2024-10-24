
import java.util.*;


public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        while (t-- >0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (mp.containsKey(x)) {
                mp.put(x, mp.get(x)+y);
            } else {
                mp.put(x, y);
            }
        }
        int time = 0;
        Set<Map.Entry<Integer, Integer>> ets = mp.entrySet();
        for (Map.Entry<Integer, Integer> x : ets) {
            if (time <= x.getKey()) {
                time = x.getKey() + x.getValue();
            } else {
                time += x.getValue();
            }
        }
        System.out.println(time);
    }
}
