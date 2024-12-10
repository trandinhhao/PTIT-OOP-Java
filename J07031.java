
import java.io.*;
import java.util.*;

public class J07031 {

    public static boolean[] f = new boolean[1000005];

    public static void sieve() {
        for (int i = 0; i <= 1000000; i++) {
            f[i] = true;
        }
        f[0] = f[1] = false;
        for (int i = 2; i <= 1000; i++) {
            if (f[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    f[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sieve();
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        //
        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        //
        TreeSet<Integer> se1 = new TreeSet<>(a);
        TreeSet<Integer> se2 = new TreeSet<>(b);
        //
        for (int x : se1) {
            if (x > 500000) {
                break;
            }
            int res = 1000000 - x;
            if (f[x] && f[res] && se1.contains(res) && !se2.contains(x) && !se2.contains(res)) {
                System.out.println(x + " " + res);
            }
        }
    }
}
