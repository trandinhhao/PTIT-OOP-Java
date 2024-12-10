
import java.io.*;
import java.util.*;

public class J07040 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc = new Scanner(new File("VANBAN.in"));
        //
        ArrayList<String> a = (ArrayList<String>) in1.readObject();
        ArrayList<String> b = new ArrayList<>();
        for (String x : a) {
            String[] s = x.split("\\s+");
            for (String i : s) {
                b.add(i.toLowerCase());
            }
        }
        LinkedHashSet<String> se = new LinkedHashSet<>();
        while (sc.hasNext()) {
            String[] s = sc.nextLine().split("\\s+");
            for (String x : s) {
                se.add(x.toLowerCase());
            }
        }
        for (String x : se) {
            if (b.contains(x)) {
                System.out.println(x);
            }
        }
    }
}
