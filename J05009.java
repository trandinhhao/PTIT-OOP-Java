
import java.util.*;

class ThiSinh {

    private int mts;
    private String ten;
    private String ns;
    private double d;

    public ThiSinh(int mts, String ten, String ns, double d) {
        this.mts = mts;
        this.ten = ten;
        this.ns = ns;
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public String toString() {
        return this.mts + " " + this.ten + " " + this.ns + " " + this.getD();
    }
}

public class J05009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        double diemMax = -1;
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            ThiSinh x = new ThiSinh(i, sc.nextLine(), sc.nextLine(), sc.nextDouble() + sc.nextDouble() + sc.nextDouble());
            a.add(x);
            if (x.getD() > diemMax) {
                diemMax = x.getD();
            }
        }
        for (ThiSinh x : a) {
            if (diemMax == x.getD()) {
                System.out.println(x);
            }
        }
    }
}
