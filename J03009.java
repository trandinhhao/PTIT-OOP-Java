
import java.util.*;

public class J03009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            TreeSet<String> se1 = new TreeSet<>();
            TreeSet<String> se2 = new TreeSet<>();
            String[] a1 = s1.split("\\s+");
            String[] a2 = s2.split("\\s+");
            for (String x : a1) {
                se1.add(x);
            }
            for (String x : a2) {
                se2.add(x);
            }
            for (String x : se1) {
                if (!se2.contains(x)) {
                    System.out.print(x + " ");
                }
            }
            System.out.println("");
        }
    }
}
