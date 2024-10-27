
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class NhanVien {

    private String mnv;
    private String ht;
    private String gt;
    private String ns;
    private String dc;
    private String mst;
    private String nkhd;

    public NhanVien(int mnv, String ht, String gt, String ns, String dc, String mst, String nkhd) {
        this.mnv = String.format("%05d", mnv);
        this.ht = ht;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;
    }

    public String toString() {
        return this.mnv + " " + this.ht + " " + this.gt + " " + this.ns + " " + this.dc + " " + this.mst + " " + this.nkhd;
    }

    public String getNs() {
        return ns;
    }

}

public class J05007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            NhanVien x = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<NhanVien>() {
            public int compare(NhanVien o1, NhanVien o2) {
                int d1 = Integer.parseInt(o1.getNs().substring(0, 2));
                int m1 = Integer.parseInt(o1.getNs().substring(3, 5));
                int y1 = Integer.parseInt(o1.getNs().substring(6, 10));
                int d2 = Integer.parseInt(o2.getNs().substring(0, 2));
                int m2 = Integer.parseInt(o2.getNs().substring(3, 5));
                int y2 = Integer.parseInt(o2.getNs().substring(6, 10));
                if (y1 != y2) {
                    return y1 - y2;
                } else if (m1 != m2) {
                    return m1 - m2;
                } else {
                    return d1 - d2;
                }
            }
        });
        for (NhanVien x : a) {
            System.out.println(x);
        }
    }
}
