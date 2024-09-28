
import java.io.*;
import java.util.*;

public class J07004 {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        while (sc.hasNext()) {
            int x = sc.nextInt();
            if (mp.containsKey(x)) {
                mp.put(x, mp.get(x) + 1);
            } else {
                mp.put(x, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> ets = mp.entrySet();
        for (Map.Entry<Integer, Integer> x : ets) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
