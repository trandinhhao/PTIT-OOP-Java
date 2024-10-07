
import java.util.ArrayList;
import java.util.Scanner;

public class JKT013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<String> a = new ArrayList<>();
            ArrayList<String> save = new ArrayList<>();
            a.add("6");
            a.add("8");
            while (a.size() > 0) {
                String tmp = a.get(0);
                a.remove(tmp);
                save.add(tmp);
                String s1 = tmp + "6";
                String s2 = tmp + "8";
                if (s1.length() > n || s2.length() > n) {
                    continue;
                }
                a.add(s1);
                a.add(s2);
            }
            System.out.println(save.size());
            for (int i = save.size() - 1; i >= 0; i--) {
                System.out.print(save.get(i) + " ");
            }
            System.out.println("");
        }
    }
}
