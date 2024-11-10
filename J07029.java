
import java.io.*;
import java.util.*;

public class J07029 {

    public static boolean check(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        TreeMap<Integer, Integer> mp = new TreeMap(Comparator.reverseOrder());
        for (Integer x : a) {
            if (mp.containsKey(x)) {
                mp.put(x, mp.get(x) + 1);
            } else {
                mp.put(x, 1);
            }
        }
        int cnt = 0;
        Set<Map.Entry<Integer, Integer>> ets = mp.entrySet();
        for (Map.Entry<Integer, Integer> x : ets) {
            if (cnt >= 10) {
                break;
            }
            if (check(x.getKey())) {
                System.out.println(x.getKey() + " " + x.getValue());
                cnt++;
            }
        }
    }
}
