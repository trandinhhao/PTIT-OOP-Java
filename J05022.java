
import java.util.*;

class SinhVien {

    private String msv, ten, lop, email;

    public SinhVien(String msv, String ten, String lop, String email) {
        this.msv = msv.trim();
        this.ten = ten.trim();
        this.lop = lop.trim();
        this.email = email.trim();
    }

    public String getLop() {
        return lop;
    }

    public String toString() {
        return this.msv + " " + this.ten + " " + this.lop + " " + this.email;
    }
}

public class J05022 {

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
            String ma = sc.nextLine().trim();
            System.out.println("DANH SACH SINH VIEN LOP " + ma + ":");
            for (SinhVien x : a) {
                if (x.getLop().equals(ma)) {
                    System.out.println(x);
                }
            }
        }
    }
}
