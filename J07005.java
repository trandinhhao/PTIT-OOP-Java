
import java.io.*;
import java.util.*;

public class J07005 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("DATA.IN");
        DataInputStream sc = new DataInputStream(f);
        //
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        try {
            while (true) {
                int x = sc.readInt();
                if (mp.containsKey(x)) {
                    mp.put(x, mp.get(x) + 1);
                } else {
                    mp.put(x, 1);
                }
            }
        } catch (Exception e) {
            
        }
        Set<Map.Entry<Integer, Integer>> ets = mp.entrySet();
        for (Map.Entry<Integer, Integer> x : ets) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
