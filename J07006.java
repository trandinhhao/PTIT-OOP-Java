
import java.io.*;
import java.util.*;

public class J07006 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("DATA.in");
        ObjectInputStream sc = new ObjectInputStream(f);
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        //
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
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
