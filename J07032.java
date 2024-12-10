
import java.io.*;
import java.util.*;

public class J07032 {

    public static boolean check(String x) {
        if (x.length() % 2 == 0 || x.length() == 1) {
            return false;
        }
        for (char i : x.toCharArray()) {
            if ((i - '0') % 2 == 0) {
                return false;
            }
        }
        for (int i = 0; i < x.length() / 2; i++) {
            if (x.charAt(i) != x.charAt(x.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        //
        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        //
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        for (int x : a) {
            if (check(String.valueOf(x))) {
                if (mp1.containsKey(x)) {
                    mp1.put(x, mp1.get(x) + 1);
                } else {
                    mp1.put(x, 1);
                }
            }
        }
        //
        for (int x : b) {
            if (check(String.valueOf(x))) {
                if (mp2.containsKey(x)) {
                    mp2.put(x, mp2.get(x) + 1);
                } else {
                    mp2.put(x, 1);
                }
            }
        }
        //
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (Map.Entry<Integer, Integer> x : mp1.entrySet()) {
            if (mp2.containsKey(x.getKey())) {
                mp.put(x.getKey(), x.getValue() + mp2.get(x.getKey()));
            }
        }
        int cnt = 0;
        for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
            cnt++;
            if (cnt == 10) {
                break;
            }
        }
    }
}
