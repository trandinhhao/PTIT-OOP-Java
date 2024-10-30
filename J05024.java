
import java.util.*;

class SinhVien {

    private String msv, ten, lop, email;

    public SinhVien(String msv, String ten, String lop, String email) {
        this.msv = msv.trim();
        this.ten = ten.trim();
        this.lop = lop.trim();
        this.email = email.trim();
    }

    public String getMsv() {
        return msv;
    }

    public String getLop() {
        return lop;
    }

    public String toString() {
        return this.msv + " " + this.ten + " " + this.lop + " " + this.email;
    }
}

public class J05024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> a = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String ma = sc.nextLine().trim().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + ma + ":");
            for (SinhVien x : a) {
                if (ma.equals("KE TOAN") && "DCKT".equals(x.getMsv().substring(3, 7))) {
                    System.out.println(x);
                } else if (ma.equals("VIEN THONG") && "DCVT".equals(x.getMsv().substring(3, 7))) {
                    System.out.println(x);
                } else if (ma.equals("DIEN TU") && "DCDT".equals(x.getMsv().substring(3, 7))) {
                    System.out.println(x);
                } else {
                    if (x.getLop().charAt(0) != 'E') {
                        if (ma.equals("CONG NGHE THONG TIN") && "DCCN".equals(x.getMsv().substring(3, 7))) {
                            System.out.println(x);
                        } else if (ma.equals("AN TOAN THONG TIN") && "DCAT".equals(x.getMsv().substring(3, 7))) {
                            System.out.println(x);
                        }
                    }
                }
            }
        }
    }
}
