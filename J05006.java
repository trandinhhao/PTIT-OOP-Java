
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
}

public class J05006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++) {
            NhanVien x = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            System.out.println(x);
        }
    }
}
