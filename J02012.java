
import java.util.*;
import java.math.*;

public class J02012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> x = new ArrayList<>();
        x.add(a[0]);
        System.out.println("Buoc " + 0 + ": " + x.get(0));
        for (int i = 1; i < n; i++) {
            int j = 0;
            while (j < x.size() && x.get(j) < a[i]) {
                j++;
            }
            x.add(j, a[i]);
            System.out.print("Buoc " + i + ": ");
            for (int g : x) {
                System.out.print(g + " ");
            }
            System.out.println("");
        }
    }
}
