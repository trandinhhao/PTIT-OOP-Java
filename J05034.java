
import java.util.*;

class SinhVien {

    private int stt;
    private String msv, ten, lop, email, dn;

    public SinhVien(int stt, String msv, String ten, String lop, String email, String dn) {
        this.stt = stt;
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }

    public String getTen() {
        return ten;
    }

    public String getDn() {
        return dn;
    }

    public String toString() {
        return stt + " " + msv + " " + ten + " " + lop + " " + email + " " + dn;
    }

}

public class J05034 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            SinhVien x = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }

        });
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String res = sc.nextLine();
            for (SinhVien x : a) {
                if (x.getDn().equals(res)) {
                    System.out.println(x);
                }
            }
        }
    }
}
