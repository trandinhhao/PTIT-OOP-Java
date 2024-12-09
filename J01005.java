
import java.util.*;


public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            double h = sc.nextDouble();
            // Dien tich tam giac
            double totalS = 0.5 * h * 1;
            double onePart = totalS / n;
            ArrayList<Double> a = new ArrayList<>();
            for (int i = 1;i<n;i++) {
                double under = onePart * i;
                double height = Math.sqrt((totalS - under) * 2 * h);
                a.add(height);
            }
            Collections.reverse(a);
            for (double x : a) {
                System.out.printf("%.6f", x);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
