
import java.util.*;

class SinhVien {

    private String id, ten;
    private double d1, d2, d3, diemCong, tong;
    private int res;
    private String kq;

    public SinhVien(String id, String ten, double d1, double d2, double d3) {
        this.id = id;
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        char x = id.charAt(2);
        if (x == '1') {
            this.diemCong = 0.5;
        } else if (x == '2') {
            this.diemCong = 1;
        } else {
            this.diemCong = 2.5;
        }
        this.tong = d1 * 2 + d2 + d3;
        this.tong += this.diemCong;
        if (this.tong >= 24) {
            this.kq = "TRUNG TUYEN";
        } else {
            this.kq = "TRUOT";
        }
    }

    public double getTong() {
        return tong;
    }

    private String convert(double x) {
        if ((int) x == x) {
            return String.format("%.0f", x);
        } else {
            return String.format("%.1f", x);
        }
    }

    public String toString() {
        return id + " " + ten + " " + convert(diemCong) + " " + convert(tong) + " " + kq;
    }
}

public class J05058 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        while (t-- > 0) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
            sc.nextLine();
        }
        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getTong() > o2.getTong()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (SinhVien x : a) {
            System.out.println(x);
        }
    }
}
