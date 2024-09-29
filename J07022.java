
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07022 {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                int x = Integer.parseInt(s);
            } catch (Exception e) {
                a.add(s);
            }
        }
        Collections.sort(a, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        });
        for (String x : a) {
            System.out.print(x + " ");
        }
    }
}
