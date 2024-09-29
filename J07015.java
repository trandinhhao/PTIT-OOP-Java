
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class J07015 {

    public static boolean check(int x) {
        if (x == 0 || x == 1) {
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
        FileInputStream f = new FileInputStream("SONGUYEN.in");
        ObjectInputStream sc = new ObjectInputStream(f);
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();

        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (Integer x : a) {
            if (mp.containsKey(x)) {
                mp.put(x, mp.get(x) + 1);
            } else {
                mp.put(x, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> ets = mp.entrySet();
        for (Map.Entry<Integer, Integer> x : ets) {
            if (check(x.getKey())) {
                System.out.println(x.getKey() + " " + x.getValue());
            }
        }
    }
}
