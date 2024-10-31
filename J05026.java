
import java.util.*;

class GiangVien {

    private String ma, ten, khoa;

    public GiangVien(int ma, String ten, String khoa) {
        this.ma = "GV" + String.format("%02d", ma);
        this.ten = ten;
        this.khoa = khoa;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        String[] a1 = this.ten.split("\\s+");
        return a1[a1.length - 1];
    }

    public String getKhoa() {
        return khoa;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.khoa;
    }
}

public class J05026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            String khoa = sc.nextLine();
            StringBuilder sb = new StringBuilder("");
            String[] tmp = khoa.split("\\s+");
            for (String y : tmp) {
                sb.append(y.toUpperCase().charAt(0));
            }
            GiangVien x = new GiangVien(i, ten, sb.toString());
            a.add(x);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String khoa = sc.nextLine();
            StringBuilder sb = new StringBuilder("");
            String[] tmp = khoa.split("\\s+");
            for (String y : tmp) {
                sb.append(y.toUpperCase().charAt(0));
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + sb.toString() + ":");
            for (GiangVien x : a) {
                if (x.getKhoa().compareTo(sb.toString()) == 0) {
                    System.out.println(x);
                }
            }
        }
    }
}
