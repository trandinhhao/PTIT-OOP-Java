
import java.io.*;
import java.util.*;

public class J07030 {

    public static boolean[] f = new boolean[1000002];

    public static void sieve() {
        for (int i = 0; i <= 1000000; i++) {
            f[i] = true;
        }
        f[0] = f[1] = false;
        for (int i = 2; i <= 1000; i++) {
            if (f[i] == true) {
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
        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        TreeSet<Integer> se1 = new TreeSet<>(a);
        for (int x : se1) {
            if (x > 500000) {
                break;
            }
            if (f[x] && f[1000000 - x] && b.contains(1000000 - x)) {
                System.out.println(x + " " + (1000000 - x));
            }
        }
    }
}
